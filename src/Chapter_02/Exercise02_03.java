package Chapter_02;

/**
 * a program that reads a number in feet, converts it to meters, and displays the result.
 *
 * Conversion from foot to meter:
 * One foot is 0.305 meter.
 */

import java.util.Scanner;

public class Exercise02_03 {
    public static void main(String[] args) {
        final double METER_PER_FEET = 0.305;
        // creating Scanner object
        Scanner input = new Scanner(System.in);
        // prompting user for input
        System.out.print("Enter a value for feet: ");

        // assign variable feet of type double with value entered by user
        double feet = input.nextDouble();
        // assign variable meters of type double with result of conversion expression
        double meters = feet * METER_PER_FEET;

        // displaying result
        System.out.println(feet + " feet is " + meters + " in meters");
    }
}
