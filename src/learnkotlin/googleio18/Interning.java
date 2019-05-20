package learnkotlin.googleio18;

public class Interning {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder().append("yes");
        System.out.println(sb.toString() == "yes");
    }
}
