package Chapter_02;

/**
 * a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
 * @author baro
 * @version 1.0
 * @since 7/13/23
 */

import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = (input.nextDouble() / 100.0) * subtotal;

        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
