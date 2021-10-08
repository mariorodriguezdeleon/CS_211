/* Mario Rodriguez, CS 211
 * 980384835
 * October 8, 2021
 * Bellevue College
 * Client class client to the NewRandom class - Extends the Java Random class.  Overloads the nextInt() method and provides additional methods as
 * required for this assignment.
 * Requirements:
 *   include six call to each of the methods in the NewRandom class.
 */

public class NewRandomTest {

    public static void main (String[] args) {

        NewRandom rand = new NewRandom();

        System.out.println("n1) Test: nextInt(low, high)");
        for (int i = 0; i < 6; i++) {
            int a = rand.nextInt(3, 9);
            System.out.println(a);
        }

        System.out.println("n2) Test: nextEven(low, high)");
        for (int i = 0; i < 6; i++) {
            int a = rand.nextEven(3, 9);
            System.out.println(a);
        }

        System.out.println("n3) Test: nextOdd(low, high)");
        for (int i = 0; i < 6; i++) {
            int a = rand.nextOdd(3, 9);
            System.out.println(a);
        }

        System.out.println("n4) Test: nextChar() random capital letter");
        for (int i = 0; i < 6; i++) {
            char a = rand.nextChar();
            System.out.println(a);
        }

        System.out.println("n5) Test: nextChar(from, to) random capital letter too");
        for (int i = 0; i < 6; i++) {
            char a = rand.nextChar((char) 70, (char) 72);
            System.out.println(a);
        }

        System.out.println("n6) Test: nextChar (char c, int i)");
        for (int i = 0; i < 6; i++) {
            char a = rand.nextChar('C', -5);
            System.out.println(a);
        }

        System.out.println("n7) Test: nextSpecialChar()");
        for (int i = 0; i < 6; i++) {
            char a = rand.nextSpecialChar();
            System.out.println(a);
        }

    }

}