package Chapter_02;

/**
 * a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 *
 * For example, if an integer is 932, the sum of all its digits is 14.
 *
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
 * For instance, 932 % 10 = 2 and 932 / 10 = 93.
 *
 * @author baro
 * @version 1.0
 * @since 7/13/23
 */

import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int remainingDigits = number;

        int onesPlace = number % 10;
        remainingDigits /= 10;

        int tenthsPlace = remainingDigits % 10;
        remainingDigits /= 10;

        int hundredsPlace = remainingDigits % 10;

        int sum = onesPlace + tenthsPlace + hundredsPlace;

        System.out.println("The sum of the digits is " + sum);
    }
}
