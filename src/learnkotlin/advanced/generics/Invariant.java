package learnkotlin.advanced.generics;

import java.util.ArrayList;
import java.util.List;

public class Invariant {

    private static class Person {
    }

    private static class Employee extends Person {
    }

    private static void operate(List<Person> people) {

    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        operate(people);    // works

        List<Employee> employees = new ArrayList<>();
        // operate(employees);    // not covariant

    }
}
