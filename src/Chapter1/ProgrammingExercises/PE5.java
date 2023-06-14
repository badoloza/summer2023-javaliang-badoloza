/**
 * Requirements Specification:
 * Program must display the result of:
 * 9.5 X 4.5 - 2.5 X 3
 * -------------------
 *     45.5 - 3.5
 *
 * System Analysis:
 * Program output will be the result of given expression
 *
 * System Design:
 * Use System class's println method to print result of expression to console
 */

package Chapter1.ProgrammingExercises;

public class PE5 {
    public static void main(String[] args) {
        System.out.println((((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5)));
    }
}
