package Chapter_03;

import java.util.Scanner;

/**
 * Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question.
 * Revise the program to randomly generate an addition question with two integers less than 100.
 */

public class Exercise03_10 {
    public static void main(String[] args) {
        // getting user input
        Scanner input = new Scanner(System.in);

        // generating 2 random integers less than 100
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        if (answer == (number1 + number2)) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 + " is " + (number1 + number2));
        }
    }
}
