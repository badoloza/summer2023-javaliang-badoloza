package Chapter_03;

/**
 * Write a program that prompts the user to enter a three-digit integer and
 * determines whether it is a palindrome integer. An integer is palindrome if it reads the same
 * from right to left and from left to right. A negative integer is treated the same as a positive integer.
 */

import java.util.Scanner;

public class Exercise03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer (e.g., 123): ");
        int number = input.nextInt();

    }
}
