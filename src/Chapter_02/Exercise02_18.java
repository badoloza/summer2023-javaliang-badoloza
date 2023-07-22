package Chapter_02;

/**
 * (Print a table) Write a program that displays the following table. Cast floating-point numbers into integers.
 *
 * a    b   pow(a, b)
 * 1    2   1
 * 2    3   8
 * 3    4   81
 * 4    5   1024
 * 5    6   15625
 *
 */

public class Exercise02_18 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("a    b   pow(a, b)");
        System.out.println(a + "    " + b + "   " + (int)Math.pow(a, b));
        System.out.println(++a + "    " + ++b + "   " + (int)Math.pow(a, b));
        System.out.println(++a + "    " + ++b + "   " + (int)Math.pow(a, b));
        System.out.println(++a + "    " + ++b + "   " + (int)Math.pow(a, b));
        System.out.println(++a + "    " + ++b + "   " + (int)Math.pow(a, b));
    }
}
