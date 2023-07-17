package Chapter_02;

/**
 * a program that calculates the energy needed to heat water from an initial temperature to a final temperature.
 * Your program should prompt the user to enter the amount of water in kilograms and the initial and final temperatures
 * of the water.
 *
 * Note: Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms,
 * initial and final temperatures are in degrees Celsius,
 * and
 * energy Q is measured in joules.
 *
 * @author baro
 * @version 1.0
 * @since 7/16/23
 */

import java.util.Scanner;

public class Exercise02_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double amountOfWater = input.nextDouble();

        System.out.print("Enter the initial temperature in celsius: ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature in celsius: ");
        double finalTemp = input.nextDouble();

        double energy = amountOfWater * (finalTemp - initialTemp) * 4184;

        System.out.println("The energy needed is " + energy + " joules");
    }
}
