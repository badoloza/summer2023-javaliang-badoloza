package Chapter_02;

/**
 * Problem:
 * Write a program that prompts the user to enter v in meters/second (m/s) and the
 * acceleration a in meters/second squared (m/s2), then, displays the minimum runway length.
 *
 * Note:
 * Given an airplane’s acceleration a and take-off speed v, you can compute the minimum runway length needed for
 * an airplane to take off using the following formula:
 *
 * length = v^(2) / (2a)
 *
 * Requirement Specification:
 * This program must satisfy the following requirements:
 * 1. It must prompt the user for input of v and a
 * 2. It must display the minimum runway length
 *
 * System Analysis:
 * The output of this program is the minimum runway length
 * which can be obtained by the following formula:
 *
 * length = v^(2) / (2a)
 * Therefore the input needed for the program is speed and acceleration
 *
 * System Design:
 * 1. Prompt the user for input values for speed and acceleration
 * 2. Calculate the minimum runway length using the preceding formula
 * 3. Display the result
 *
 */

import java.util.Scanner;

public class Exercise02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + (int)(length * 1000.0 + 0.5) / 1000.0);
    }
}
