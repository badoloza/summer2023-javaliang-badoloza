package Chapter_02;

/**
 * Problem:
 * Write a program that prompts the user to enter a temperature between -58°F and 41°F and a wind speed greater
 * than or equal to 2 then displays the wind-chill temperature. Use Math.pow(a, b) to compute v^(0.16).
 *
 * 1. Note:
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone is not enough to provide the answer.
 * Other factors including wind speed, relative humidity, and sunshine play important roles in determining coldness
 * outside. In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to measure the
 * coldness using temperature and wind speed.
 *
 * 2. Note:
 * Using \u00B0 makes the ° sign.
 *
 * Formula:
 * twc = 35.74 + 0.6215ta - 35.75 * v^(0.16) + 0.4275ta * v^(0.16)
 * where ta is the outside temperature measured in degrees Fahrenheit, v is the speed measured in miles per hour, and
 * twc is the wind-chill temperature. The formula cannot be used for wind speeds below
 * 2 mph or temperatures below -58°F or above 41°F.
 *
 */

import java.util.Scanner;

public class Exercise02_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58\u00B0F and 41\u00B0F: ");
        double fahrenheit = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChillTemperature = 35.74 + (0.6215 * (fahrenheit)) - (35.75 * Math.pow(windSpeed, 0.16))
                + (0.4275 * (fahrenheit)) * Math.pow(windSpeed, 0.16);

        System.out.println(windChillTemperature);

        // If wind chill is a positive number, then it will round up at the 5th decimal
        // If wind chill is a negative number, then it will not round up and just cut off at 5th decimal
        // it will not produce the output -5.56707, instead -5.56706 from sample input

        System.out.println("The wind chill index is " + (int)(windChillTemperature * 100000 + 0.5) / 100000.0);
    }
}
