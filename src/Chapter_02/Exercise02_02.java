package Chapter_02;

/**
 * a program that reads in the radius and length of a cylinder and computes the area and volume using
 * the following formulas:
 *         area = radius * radius * π
 *         volume = area * length
 *
 * @author baroloza
 * @version 1.0
 * @since 7/6/23
 */

import java.util.Scanner;

public class Exercise02_02 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        // creating Scanner object
        Scanner input = new Scanner(System.in);
        // getting user input
        System.out.print("Enter the radius and length of a cylinder: ");

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
