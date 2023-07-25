package Chapter_03;

/**
 * Write a program that prompts the user to enter the first 9 digits and displays the 10-digit
 * ISBN (including leading zeros). Your program should read the input as an integer.
 *
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
 *
 * An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
 * The last digit, d10, is a checksum, which is calculated from the other 9 digits using the following formula:
 *
 * ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11
 *
 */

import java.util.Scanner;

public class Exercise03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();
        int remainingDigits = isbn;

        int digit1 = remainingDigits / 100000000;
        remainingDigits %= 100000000;
        int digit2 = remainingDigits / 10000000;
        remainingDigits %= 10000000;
        int digit3 = remainingDigits / 1000000;
        remainingDigits %= 1000000;
        int digit4 = remainingDigits / 100000;
        remainingDigits %= 100000;
        int digit5 = remainingDigits / 10000;
        remainingDigits %= 10000;
        int digit6 = remainingDigits / 1000;;
        remainingDigits %= 1000;
        int digit7 = remainingDigits / 100;;
        remainingDigits %= 100;
        int digit8 = remainingDigits / 10;;
        remainingDigits %= 10;
        int digit9 = remainingDigits;

        int checksum = (digit1 + (digit2 * 2) + (digit3 * 3) + (digit4 * 4) + (digit5 * 5) + (digit6 * 6)
                + (digit7 * 7) + (digit8 * 8) + (digit9 * 9)) % 11;
        System.out.print("The ISBN-10 number is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7
                + digit8 + digit9);
        if (checksum == 10) {
            System.out.println("X");
        }
        else {
            System.out.println(checksum);
        }
    }
}
