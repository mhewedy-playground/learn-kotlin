package learnkotlin.advanced.functions

data class Request(val method: String, val query: String, val contentType: String)
data class Response(var payload: String, var status: Status) {
    operator fun invoke(fStatus: Status.() -> Unit) {}
}

data class Status(var code: Int, var desc: String)

class RouteHandler(val request: Request, val response: Response) {

    fun execute() {
        println("---- executing -----")
        println("received $request \n and sending back $response")
        println("//---- executing -----")
    }
}

fun handle(
    method: String = "GET", path: String,
    f: RouteHandler.() -> Unit
): RouteHandler.() -> Unit {
    
    fun extractQueryParam(path: String): String = "param1=value1"

    val routeHandler = RouteHandler(
        Request(method, extractQueryParam(path), "application/json"),
        Response("", Status(0, ""))
    )
    f(routeHandler)

    routeHandler.execute()

    return f
}

fun main() {
    handle(path = "/api/v1/children") {

        if (request.contentType != "application/json")
            throw IllegalArgumentException("Invalid content request type")

        response {
            code = 200
            desc = "OK"
        }
    }
}