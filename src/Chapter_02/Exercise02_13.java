package Chapter_02;

/**
 * Problem:
 * Write a program that prompts the user to enter a monthly saving amount and displays the account value after
 * the sixth month. (In Programming Exercise 5.30, you will use a loop to simplify the code and display the account
 * value for any month.)
 *
 * Note: (Financial application: compound value)
 * Suppose you save $100 each month into a savings account with an annual interest rate of 5%.
 * Thus, the monthly interest rate is 0.05/12 = 0.00417.
 * After the first month, the value in the account becomes
 *          100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 *          (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 *          (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 *
 * Requirement Specification:
 * This program must satisfy the following requirements:
 * 1. It must prompt the user for monthly saving amount
 * 2. It must display the account value after 6 months
 *
 * System Analysis:
 * 1. The output of this program is the account value after 6 months from initial savings amount
 *      which can be obtained by adding the deposit amount with the monthly interest rate
 *
 *
 */

import java.util.Scanner;

public class Exercise02_13 {
    public static void main(String[] args) {
        final double ANNUAL_INTEREST_RATE = 0.05;
        final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE / 12;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();

        double firstMonth = savingAmount * (1 + MONTHLY_INTEREST_RATE);
        double secondMonth = (savingAmount + firstMonth) * (1 + MONTHLY_INTEREST_RATE);
        double thirdMonth = (savingAmount + secondMonth) * (1 + MONTHLY_INTEREST_RATE);
        double fourthMonth = (savingAmount + thirdMonth) * (1 + MONTHLY_INTEREST_RATE);
        double fifthMonth = (savingAmount + fourthMonth) * (1 + MONTHLY_INTEREST_RATE);
        double sixthMonth = (savingAmount + fifthMonth) * (1 + MONTHLY_INTEREST_RATE);

        System.out.println("After the sixth month, the account value is $" + (int)(sixthMonth * 100.00 + 0.5) / 100.0);
    }
}
