package Chapter_02;

/**
 * Problem:
 * Write a program that prompts the user to enter the side of a hexagon and displays its area.
 *
 * Note:
 * Formula for computing the area of a hexagon:
 * area = (3sqrt(3) / 2) * s^(2)
 */

import java.util.Scanner;

public class Exercise02_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();

        double area = (3 * Math.pow(3, 0.5) / 2) * Math.pow(side, 2);

        System.out.println("The area of the hexagon is " + (int)(area * 10000 + 0.5) / 10000.0);
    }
}
