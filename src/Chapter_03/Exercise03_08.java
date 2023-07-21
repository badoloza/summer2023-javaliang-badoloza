package Chapter_03;

/**
 * Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.
 */

import java.util.Scanner;

public class Exercise03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 integers (e.g., 1 2 3): ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        System.out.println(number1 + " " + number2 + " " + number3);
        }
    }
