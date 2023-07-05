package Chapter_01;

/**
 * Requirements Specification:
 * The program must print the following pattern to console:
 *              J     A     V     V     A
 *              J    A A     V   V     A A
 *         J    J   AAAAA     V V     AAAAA
 *          J  J   A     A     V     A     A
 *
 * System Analysis:
 * The program outputs the pattern to console
 *
 * System Design:
 * Use System class to print required pattern
 */

public class Exercise01_03 {
    public static void main(String[] args) {
        System.out.println("     J     A     V     V     A");
        System.out.println("     J    A A     V   V     A A");
        System.out.println("J    J   AAAAA     V V     AAAAA");
        System.out.println(" J  J   A     A     V     A     A");
    }
}
