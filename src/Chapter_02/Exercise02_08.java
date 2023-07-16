package Chapter_02;

/**
 * Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT.
 * Revise the program so it prompts the user to enter the time zone offset to GMT and displays the time in the
 * specified time zone.
 *
 * @author baro
 * @version 1.0
 * @since 7/15/23
 */

import java.util.Scanner;

public class Exercise02_08 {
    public static void main(String[] args) {
        // creating a scanner object
        Scanner input = new Scanner(System.in);

        // prompting user for input and storing
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // getting current time in GMT
        // total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        // current second
        long currentSecond = totalSeconds % 60;

        // total minutes
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        // total hours
        long totalHours = totalMinutes / 60;
        // adding offset to represent specified timezone for current hour
        // in 24hr format
        long currentHour = (totalHours + offset) % 24;

        // displaying current time in specified timezone
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);



    }
}
