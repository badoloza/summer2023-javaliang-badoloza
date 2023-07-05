package Chapter_02;
import java.util.Scanner;

/**
 * A program that reads a Celsius degree in a double value from the console,
 * then converts it to Fahrenheit, and displays the result.
 *
 * Using fahrenheit formula:
 * fahrenheit = (9 / 5) * celsius + 32
 *
 * @author baroloza
 * @version 1.0
 * @since 7/5/23
 */

public class Exercise02_01 {
    public static void main(String[] args) {
        // declaring and initializing variable input of type Scanner
        Scanner input = new Scanner(System.in);
        // prompting user for input
        System.out.print("Enter a degree in Celsius: ");
        // declaring and initializing variable celsius of type double
        double celsius = input.nextDouble();

        // declaring and initializing variable fahrenheit of type double
        // with result of conversion computation
        double fahrenheit = ((9 / 5.0) * celsius) + 32;

        // displaying result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
