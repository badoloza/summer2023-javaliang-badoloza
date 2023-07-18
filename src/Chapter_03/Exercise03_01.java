package Chapter_03;

/**
 * Problem:
 * Write a program that prompts the user to enter values for a, b, and c and displays the result based on the
 * discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one root.
 * Otherwise, display “The equation has no real roots.”
 *
 * Note:
 * The two roots of a quadratic equation ax^(2) + bx + c = 0 can be obtained by using the following formula:
 * r1 = -b + sqrt(b^(2) - 4ac) / 2a
 * r2 = -b - sqrt(b^(2) - 4ac) / 2a
 *
 * b^(2) - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots.
 * If it is zero, the equation has one root. If it is negative, the equation has no real roots.
 *
 *
 */

import java.util.Scanner;

public class Exercise03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        double root1 = ((-b) + Math.pow(discriminant, 0.5)) / (2 * a);
        double root2 = ((-b) - Math.pow(discriminant, 0.5)) / (2 * a);

        if (discriminant > 0) {
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        }
        else if (discriminant == 0) {
            System.out.println("The equation has one root " + root1);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
