package Chapter_03;

/**
 * Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches.
 * For example, if a person is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches.
 */

import java.util.Scanner;

public class Exercise03_06 {
    public static void main(String[] args) {
       final double KILOGRAMS_PER_POUND = 0.45359237;
       final double METERS_PER_INCH = 0.0254;
       final double INCH_PER_FOOT = 12;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double feetInInches = feet * INCH_PER_FOOT;
        double heightInMeters = (feetInInches + inches) * METERS_PER_INCH;

        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);
        System.out.println("BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25.0) {
            System.out.println("Normal");
        }
        else if (bmi < 30.0) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
