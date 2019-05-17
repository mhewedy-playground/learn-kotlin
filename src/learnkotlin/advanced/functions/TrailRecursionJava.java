package learnkotlin.advanced.functions;

public class TrailRecursionJava {

    private static int factorialTr(int number, int accumulator) {
        if (number == 0) {
            return accumulator;
        } else {
            return factorialTr(number - 1, accumulator * number);
        }
    }

    public static void main(String[] args) {
        // throws StackOverflowError, because Java doesn't have Tail Call Optimization
        int fact = factorialTr(50000, 1);

        System.out.println(fact);
    }
}
