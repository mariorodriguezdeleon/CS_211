/* Mario Rodriguez, CS 210
 * April 19, 2021
 * Bellevue College
 * NewRandom class Client
 * Requirements:
 */

public class NewRandomClient {

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

        System.out.println("n5) Test: nextChar(to, from) random capital letter too");
        for (int i = 0; i < 6; i++) {
            char a = rand.nextChar((char) 65, (char) 90);
            System.out.println(a);
        }

        System.out.println("n6) Test: nextSpecialChar()");
        for (int i = 0; i < 6; i++) {
            char a = rand.nextSpecialChar();
            System.out.println(a);
        }

    }

}