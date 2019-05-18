package learnkotlin.advanced.reflection;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        printlnList(strings);
        printlnList(integers);

    }

    private static <T> void printlnList(List<T> list) {

    }
}
