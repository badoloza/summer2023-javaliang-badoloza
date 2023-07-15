package Chapter_02;

/**
 * a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the maximum number of years
 * and remaining days for the minutes.
 *
 * For simplicity, assume that a year has 365 days.
 *
 * @author baro
 * @version 1.0
 * @since 7/13/23
 */

import java.util.Scanner;

public class Exercise02_07 {
    public static void main(String[] args) {
        // calculating minutes in a year
        final int minutesInAYear = 365 * 24 * 60;
        // calculating minutes in a day
        final int minutesInADay = minutesInAYear / 365;
        // creating scanner object
        Scanner input = new Scanner(System.in);

        // prompting user for input
        System.out.print("Enter the number of minutes: ");
        // storing amount of minutes user entered
        int minutes = input.nextInt();
        int remainingMinutes = minutes;

        // calculating total years and days
        int years = minutes / minutesInAYear;
        remainingMinutes %= minutesInAYear;

        int days = remainingMinutes / minutesInADay;

        System.out.println(minutes + " is approximately " + years + " years" + " and "
                + days + " days");

    }
}
