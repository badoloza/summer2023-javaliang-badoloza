package Chapter_02;

/**
 * Problem:
 * Write a program that reads the balance and the annual percentage interest rate
 * and displays the interest in the next month.
 *
 * Note:
 * (Financial application: calculate interest) If you know the balance and the annual percentage interest rate,
 * you can compute the interest on the next monthly payment using the following formula:
 *
 * interest = balance * (annualInterestRate/1200)
 */

import java.util.Scanner;

public class Exercise02_20 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double monthlyInterestRate = interestRate / 1200;
        double interest = balance * monthlyInterestRate;

        System.out.println("The interest is " + (int)(interest * 100000 + 0.5) / 100000.0);
    }
}
