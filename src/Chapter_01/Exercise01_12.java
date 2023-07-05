package Chapter_01;

/**
 * This program displays the average speed of a runner
 * that runs 24 miles in 1 hour, 45 minutes, and 35 seconds
 * in kilometers
 * 1 mile is 1.6 kilometers
 *
 * @author badoloza
 * @version 1.0
 * @since 06-27-2023
 */

public class Exercise01_12 {
    public static void main(String[] args) {
        // converting time to seconds
        System.out.print("1 hour, 45 minutes and 36 seconds in seconds: ");
        System.out.print((36 + (45 * 60) + (60 * 60)));
        System.out.println(" seconds");
        System.out.println();

        // converting miles into kilometers
        System.out.print("24 miles in kilometers is ");
        System.out.print(24 * 1.6);
        System.out.println(" kilometers");
        System.out.println();

        // calculating km per second
        System.out.print("Speed per second is ");
        System.out.print((24 * 1.6) / ((36 + (45 * 60) + (60 * 60))));
        System.out.println(" km / s");
        System.out.println();

        // calculating avg km per hour
        System.out.print("Displaying average speed of a runner that runs 24 miles in 1 hour, 45 minutes, " +
                "and 36 seconds in kilometers: ");
        System.out.println();
        System.out.print(((24 * 1.6) / ((36 + (45 * 60) + (60 * 60)))) * 60 * 60);
        System.out.println(" km / hr");
    }
}
