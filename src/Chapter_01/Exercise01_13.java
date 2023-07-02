/**
 * @description
 * This program displays the solution of the following 2 X 2 linear equation:
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 *
 * @author badoloza
 * @version 1.0
 * @since 7/2/23
 */

package Chapter_01;

public class Exercise01_13 {
    public static void main(String[] args) {
        System.out.println("Solving System of Linear Equation by Elimination");
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + .55y = 5.9");
        System.out.println();

        System.out.print("x is ");
        System.out.println((5.9 - ((((44.5 - ((3.4 / 2.1) * 5.9))) / (50.2 - ((3.4 / 2.1) * .55))) * .55)) / 2.1);

        System.out.print("y is ");
        System.out.println(((44.5 - ((3.4 / 2.1) * 5.9))) / (50.2 - ((3.4 / 2.1) * .55)));
    }
}
