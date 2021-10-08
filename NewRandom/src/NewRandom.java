/* Mario Rodriguez, CS 210
 * 980384835
 * October 8, 2021
 * Bellevue College
 * NewRandom class - Extends the Java Random class.  Overloads the nextInt() method and provides additional methods as
 * required for this assignment.
 * Requirements:
 *   Include
 *   - overload methode for nextInt()
 *   - nextEven()
 *   - nextOdd()
 *   - nextChar()
 *   - nextChar(char from, char to)
 *   - nextChar(char c, int i)
 *   - Include a nextSpecialChar()
 */

import java.util.Random;

public class NewRandom extends Random {

    // overloads Random's nextInt() to return a random number between low and high, both inclusive. n1
    public int nextInt(int low, int high) {
        int n = nextInt(high - low + 1) + low;
        return n;
    }

    // returns an even random number between low and high, both inclusive. n2
    public int nextEven(int low, int high) {
        int n = 0;
        boolean even = false;
        while (!even) {
            n = nextInt(low, high); //uses method from this class
            if (n % 2 == 0) {
                even = true;
            }
        }
        return n;
    }

    // returns an odd random number between low and high, both inclusive. n3
    public int nextOdd(int low, int high) {
        int n = 0;
        boolean odd = false;
        while (!odd) {
            n = nextInt(low, high); //uses method from this class
            if (n % 2 != 0) {
                odd = true;
            }
        }
        return n;
    }

    // returns a random upper case "capital" character. n4
    public char nextChar() {
        int n = nextInt('A', 'Z');
        char c = (char) n;
        return c;
    }

    // returns a random upper case "capital" character. n5
    public char nextChar(char from, char to) {

        int n;

        if (from < to) {
            n = nextInt(from, to);
            return (char) n;
        } else if (from > to) {
            n = nextInt(to, from);
            return (char) n;
        } else {
            return from;
        }

    }

    // returns a random upper case "capital" character. n6
    public char nextChar(char c, int i) {

        int lowerBound = 65;
        int upperBound = 90;
        int range = (int) c + i;
        char n = 'c';

        if (range == 0) {
            return c;
        } else if (range >= lowerBound && range <= upperBound ) {
            n = nextChar((char) range, c);
        } else {

            if (range > upperBound || range < lowerBound) {
                if (range > upperBound) {
                    lowerBound = upperBound - ((upperBound - range) - 26);
                    upperBound = c;
                } else {
                    upperBound = lowerBound + 26 - (lowerBound - range);
                    lowerBound = c;
                }
            }

            int numChar = nextInt(65, 90);
            while (numChar > lowerBound && numChar < upperBound) {
                numChar = nextInt(65 , 90);
            }
            n = (char) numChar;
        }

        return n;
    }

    // returns a random special character. n7
    public char nextSpecialChar(){

        int low = 33;
        int high = 126;
        char c = ' ';
        boolean special = false;

        while (!special) {
            int n = nextInt(low, high);
            c = (char) n;

            if (!Character.isDigit(c) && !Character.isLetter(c)) {
                c = (char) n;
                special = true;
            }
        }
        return c;
    }
}
