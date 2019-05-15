package learnkotlin.interop;

import org.jetbrains.annotations.NotNull;

public class JavaPerson {

    private int id;
    private String name;
    private Long ssn;

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

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    static JavaPerson asNull() {
        return null;
    }

    @NotNull
    public String neverNull(){
        return "abc";
    }
}
