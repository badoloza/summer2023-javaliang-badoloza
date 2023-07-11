package Chapter_02;

/**
 * a program that converts pounds into kilograms.
 * The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result.
 *
 * Note: One pound is 0.454 kilogram.
 *
 * @author baroloza
 * @version 1.0
 * @since 7/11/23
 */

import java.util.Scanner;

public class Exercise02_04 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.454;

        // creating scanner object
        Scanner input = new Scanner(System.in);

        // prompting user for input
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        // converting pounds to kilograms
        double kilograms = pounds * KILOGRAMS_PER_POUND;

        // displaying result
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
