package Chapter_02;

/**
 * Problem:
 * Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
 *
 * Note:
 * one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 *
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight.
 * It can be calculated by taking your weight in kilograms and dividing, by the square of your height in meters.
 *
 * Requirement Specification:
 * 
 *
 *
 */

import java.util.Scanner;

public class Exercise02_14 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double kilograms = pounds * KILOGRAMS_PER_POUND;
        double meters = height * METERS_PER_INCH;

        double bmi = kilograms / Math.pow(meters, 2);

        System.out.println("BMI is " + (int)(bmi * 10000 + 0.5) / 10000.0);
    }
}
