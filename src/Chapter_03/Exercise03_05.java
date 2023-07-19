package Chapter_03;

/**
 * Write a program that prompts the user to enter an integer for today’s day of the week
 * (Sunday is 0, Monday is 1, . . . , and Saturday is 6).
 * Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
 */

import java.util.Scanner;

public class Exercise03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();

        int futureDay = (today + elapsedDays) % 7;

        if (today == 0) {
            System.out.print("Today is Sunday ");
        }
        else if (today == 1) {
            System.out.print("Today is Monday ");
        }
        else if (today == 2) {
            System.out.print("Today is Tuesday ");
        }
        else if (today == 3) {
            System.out.print("Today is Wednesday ");
        }
        else if (today == 4) {
            System.out.print("Today is Thursday ");
        }
        else if (today == 5) {
            System.out.print("Today is Friday ");
        }
        else if (today == 6) {
            System.out.print("Today is Saturday ");
        }

        switch(futureDay) {
            case 0:
                System.out.println("and the future day is Sunday");
                break;
            case 1:
                System.out.println("and the future day is Monday");
                break;
            case 2:
                System.out.println("and the future day is Tuesday");
                break;
            case 3:
                System.out.println("and the future day is Wednesday");
                break;
            case 4:
                System.out.println("and the future day is Thursday");
                break;
            case 5:
                System.out.println("and the future day is Friday");
                break;
            case 6:
                System.out.println("and the future day is Saturday");
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
        }

    }
}
