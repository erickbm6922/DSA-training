package dsa.training.brocode.recursions;

/*
 * Recursion = When a thing is defined in terms of itself.- Wikipedia
 * Apply the result of a procedure, to a procedure.
 * A recursive method calls itself. Can be substitute for iteration.
 * Divide a problem into a sum-problems of the same type as the original.
 * Commonly used with advanced sorting algorithms and navigating trees
 * @note Advantages: easier to read/write
 *                   easier to debug
 * @note Disadvantages: sometimes slower
 *                      uses more memory 
 * @author Erick Borda
 */
public class RecursionExample {

    public static void iterationExample() {
        walkIter(5);
    }

    public static void recursionExample() {
        walkRec(5);
    }

    public static void factorialExample() {
        System.out.println(factorial(7));
    }

    public static void powerExample() {
        System.out.println(power(2, 8));
    }

    private static int power(int base, int exponent) {
        if (exponent < 1)
            return 1;
        return base * power(base, exponent - 1);
    }

    private static int factorial(int num) {
        if (num < 1)
            return 1;
        return num * factorial(num - 1);
    }

    private static void walkRec(int steps) {
        if (steps < 1)
            return;
        System.out.println("You take a step");
        walkRec(steps - 1);
    }

    private static void walkIter(int steps) {
        for (int j = 0; j < steps; j++) {
            System.out.println("You take a step");
        }
    }
}
