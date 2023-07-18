package Chapter_02;

/**
 * Problem:
 * Write a program that prompts the user to enter three points, (x1, y1), (x2, y2), (x3, y3), of a triangle
 * then displays its area.
 *
 * Note:
 * The formula for computing the area of the triangle is:
 * s = (side1 + side2 + side3) / 2;
 * area = sqrt(s * (s - side1) * (s - side2) * (s - side3))
 */

import java.util.Scanner;

public class Exercise02_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coordinates of three points seperated by spaces");
        System.out.print("like x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
        double side2 = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        double s = (side1 + side2 + side3) / 2;

        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        System.out.println("The area of the triangle is " + (int)(area * 10 + 0.5) / 10.0);
    }
}
