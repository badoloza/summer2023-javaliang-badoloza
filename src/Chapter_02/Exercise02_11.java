package Chapter_02;

/**
 * Problem:
 * Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and display the population after
 * the number of years.
 * Use the hint in Programming Exercise 1.11 for this program.
 *
 * Requirement Specification:
 * This program must satisfy the following requirements:
 * 1. It must prompt user for input and let user enter the number of years
 * 2. It must display the population after the number of years
 *
 * System Analysis:
 * The output is the population size after the number of years
 * which can be obtained by the following formula:
 *
 * population size =
 * initial population size * (number of years * (birth rate per year - death rate per year + immigrant rate per year))
 *
 * In order to calculate the population size we need to know initial population size and
 * calculate birth rate per year, death rate per year, and
 * immigrant rate per year, which can be obtained by the following formulas:
 *
 * initial population size: 312,032,486
 * birth rate = 1 birth every 7 seconds
 * death rate = 1 death every 13 seconds
 * immigrant rate = 1 new immigrant every 45 seconds
 *
 * Therefore, the input needed for the program is number of years
 *
 * System Design:
 * 1. Prompt the user to enter the number of years
 * 2. Calculate birth rate per year, death rate per year, and immigrant rate per year using preceding information
 * 3. The birth rate, death rate and immigrant rate is given in terms of seconds.
 *    The program needs to calculate the total seconds in a year and divide that by the rate to get rate per year
 *    (i.e: total seconds in a year / birth rate per second)
 * 4. Compute the population size using the preceding formula
 * 5. Display the population size after the number of years
 */

import java.util.Scanner;

public class Exercise02_11 {
    public static void main(String[] args) {
        final int INITIAL_POPULATION = 312_032_486;
        final double SECONDS_PER_YEAR = 365 * 24 * 60 * 60;
        final double BIRTHS_PER_YEAR = SECONDS_PER_YEAR / 7;
        final double DEATHS_PER_YEAR = SECONDS_PER_YEAR / 13;
        final double IMMIGRANTS_PER_YEAR = SECONDS_PER_YEAR / 45;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        double populationSize = INITIAL_POPULATION + (numberOfYears * ((BIRTHS_PER_YEAR) - (DEATHS_PER_YEAR)
                + (IMMIGRANTS_PER_YEAR)));

        System.out.println("The population in " + numberOfYears + " years is " + (long)(populationSize));

    }
}
