package Chapter_02;

/**
 * a program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in
 * meters/second, and the time span t in seconds, then displays the average acceleration.
 *
 * Note: Average acceleration is defined as the change of velocity divided by the time taken to make the change,
 * as given by the following formula:
 *
 * a = (v1 - v0) / t
 *
 * @author baro
 * @version 1.0
 * @since 7/15/23
 */

import java.util.Scanner;

public class Exercise02_09 {
    public static void main(String[] args) {
        // creating scanner object
        Scanner input = new Scanner(System.in);

        // prompting user for input
        System.out.print("Enter v0, v1, and t : ");
        double velocity0 = input.nextDouble();
        double velocity1 = input.nextDouble();
        double time = input.nextDouble();

        // calculating average acceleration
        double acceleration = (velocity1 - velocity0) / time;

        // displaying average acceleration to console
        System.out.println("The average acceleration is " + (int)(acceleration * 10000) / 10000.0);
    }
}
