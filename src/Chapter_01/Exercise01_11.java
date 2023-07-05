package Chapter_01;

/*
 * This program displays the population for each of the next five years
 * Current population: 312,032,486
 * 1 year = 365 days
 * 1 birth every 7 seconds
 * 1 death every 13 seconds
 * 1 new immigrant every 45 seconds
 *
 * note: not as accurate as can be because values are truncated
 * For a more accurate answer, add decimal to division
 * for example: instead of ((60 * 60 * 24 * 365) / 7)
 * do: ((60 * 60 * 24 * 365) / 7.0)
 */

public class Exercise01_11 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Current population = ");
        System.out.println(312032486);

        System.out.print("Seconds in a year = ");
        System.out.println(60 * 60 * 24 * 365);

        System.out.print("Births in a year = ");
        System.out.println((60 * 60 * 24 * 365) / 7);

        System.out.print("Deaths in a year = ");
        System.out.println((60 * 60 * 24 * 365) / 13);

        System.out.print("New immigrants in a year = ");
        System.out.println((60 * 60 * 24 * 365) / 45);
        System.out.println();

        System.out.print("Every year population increases by ");
        System.out.println(4505142 + 700800 - 2425846);
        System.out.println();

        System.out.print("1st year = ");
        System.out.println(312032486 + ((((60 * 60 * 24 * 365) / 7) + ((60 * 60 * 24 * 365) / 45)
                - ((60 * 60 * 24 * 365) / 13))));
        System.out.println();

        System.out.print("2nd year = ");
        System.out.println(312032486 + (2 *((((60 * 60 * 24 * 365) / 7) + ((60 * 60 * 24 * 365) / 45)
                - ((60 * 60 * 24 * 365) / 13)))));
        System.out.println();

        System.out.print("3rd year = ");
        System.out.println(312032486 + (3 *((((60 * 60 * 24 * 365) / 7) + ((60 * 60 * 24 * 365) / 45)
                - ((60 * 60 * 24 * 365) / 13)))));
        System.out.println();

        System.out.print("4th year = ");
        System.out.println(312032486 + (4 *((((60 * 60 * 24 * 365) / 7) + ((60 * 60 * 24 * 365) / 45)
                - ((60 * 60 * 24 * 365) / 13)))));
        System.out.println();

        System.out.print("5th year = ");
        System.out.println(312032486 + (5 *((((60 * 60 * 24 * 365) / 7) + ((60 * 60 * 24 * 365) / 45)
                - ((60 * 60 * 24 * 365) / 13)))));
    }
}
