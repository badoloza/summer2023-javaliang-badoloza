package Chapter_02;

/**
 * Problem:
 * Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance.
 *
 * Note:
 * Formula for computer distance between 2 points:
 * sqrt((x2 - x1)^2 + (y2 - y1)^2)
 */

import java.util.Scanner;

public class Exercise02_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        System.out.print("The distance between the two points is " + distance);
    }
}
