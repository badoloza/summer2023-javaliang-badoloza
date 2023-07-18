package Chapter_02;

/**
 * Write a program that reads in investment amount, annual interest rate, and number of years and displays the future
 * investment value using the following formula:
 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears * 12)
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1,
 * the future investment value is 1032.98.
 */

import java.util.Scanner;

public class Exercise02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage (e.g., 1.5 = 1.5%): ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        double futureInvestmentValue = investmentAmount * (Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        System.out.println("Future value is $" + (int)(futureInvestmentValue * 100.0 + 0.5) / 100.0);
    }
}
