package learnkotlin.interop;

public class JavaPerson {

    private int id;
    private String name;

    public JavaPerson() {
    }

    public JavaPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
