package Chapter_02;

/**
 * Problem:
 * Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car in
 * miles per gallon, and the price per gallon then displays the cost of the trip.
 */

import java.util.Scanner;

public class Exercise02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double drivingCost = (drivingDistance / milesPerGallon) * pricePerGallon;

        System.out.println("The cost of driving is $" + (int)(drivingCost * 100 + 0.5) / 100.0);
    }
}
