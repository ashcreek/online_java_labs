package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int x = 100;
        for (x = 100; x>0; x--) {
            System.out.println(x);
            if (x == 90) {
                break;
            }
        }
    }
}
