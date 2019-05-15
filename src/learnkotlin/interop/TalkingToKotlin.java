package learnkotlin.interop;

public class TalkingToKotlin {

    public static void main(String[] args) {

        KotlinPerson kotlinPerson = new KotlinPerson(10, "ali");

        kotlinPerson.email = "abc@efg.com";
        System.out.println(kotlinPerson.email);

        kotlinPerson.changeStatus("alive");
        kotlinPerson.changeStatus();

        System.out.println(KotlinPerson.PI);
    }
}
