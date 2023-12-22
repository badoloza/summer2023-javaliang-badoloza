package Chapter_03;

/**
 * Write a program that lets the user guess whether the flip of a coin results in heads or tails.
 * The program randomly generates an integer 0 or 1, which represents head or tail.
 * The program prompts the user to enter a guess, and reports whether the guess is correct or incorrect.
 */

import java.util.Scanner;

public class Exercise03_14 {
    public static void main(String[] args) {
        System.out.print("Let's play heads or tails!" + "\n" + "A coin has been flipped!" + "\n"
        + "Is it heads or tails? Enter 0 for heads and 1 for tails: ");

        int result = (int)((Math.random() * 2));
        Scanner userInput = new Scanner(System.in);
        int userGuess = userInput.nextInt();

        if ((userGuess != result) && result == 0) {
            System.out.println("Sorry, you lose! The correct answer is heads!");
        }
        else if ((userGuess != result) && result == 1){
            System.out.println("Sorry, you lose! The correct answer is tails!");
        }
        else if ((userGuess == result) && result == 0){
            System.out.println("You are correct! The answer is heads!");
        }
        else {
            System.out.println("You are correct! The answer is tails!");
        }
    }
}
