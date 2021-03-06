import java.util.HashMap;
import java.util.HashSet;


/*
What is the output?:

0
2
{0=1, 2=3, 4=null}
[null]

Explain how it works:

The following code instantiates two objects, 'hs' based on the HashSet class and 'hm' based on the Hashmap class.
Following the instantiation of the objects, a 'for' loop is declared and is set up to loop as long as 'i' is less than 4

Key to understanding how this code works is understanding assignment, increment/decrement, order of operations
of local variables. While the initial value of 'i' is set to 0, the subsequent increments and decrements change
the value of 'i' as the program runs.

During the initial loop:

    > 'i' is set to 0 at loop initialization

    > 'i' is printed to the console in the first line following initialization (i = 0)

    > a call to 'hm.put(i++, i++)' follows -> the key is assigned 'i' which is set to 0, then it is incremented and
    'i' now is set to 1 and the value of the key-value pair is assigned 1. After this call, the first key-value in
    the 'hm' object is {0=1} and 'i' is incremented to 2

    > following the call to 'hm.put()', a call to 'hs.add()' is made passing the argument of 'hm.get(i-1)' which is
    equal to 1 (2 - 1); since there is no index of 1 in the 'hm' object, 'null' is added to the 'hs' object

    > a second call to 'hm.put()' follows, and the arguments (i, hm.get(i--)) are passed. 'i' is equal to 2, and it
    is assigned to the key; the 'hm.get(i--)' resolves to 2. After the first loop the second key-value in the 'hm' object
    is {0=1, 2=2} (indices 0 and 1). 'i' is then decremented by 1 and near the end of the first loop 'i' = 1. And at
    the end of the loop 'i' is incremented by 1 ('i' = 2)

Second loop:

    > 'i' is equal to 2

    > 'i' is printed to the console (i = 2)

    > at the 'hm.put()' call, the key is assigned 2, 'i' is incremented by 1 ('i'= 3), value is assigned 3. End state at
    this point of object -> {0=1, 2=3} and 'i' is incremented by 1 ('i' = 4)

    > at 'hs.add()', i = 4 and 'hm.get(i-1)' = 3, since there is no index 3, 'null' is returned.

    > at the second call of 'hm.put()', i = 4 and is assigned to a key. The value returned by 'hm.get()' = 'null' and the
    third key-value pair in the 'hm' object is {4='null'}. End state of the 'hm' obj = {0=1, 2=3, 4='null'} (indices 0, 1, 2)

    > 'i' is decremented by 1, and then incremented by 1 at the end of the loop, 'i' = 4

Third loop:

    > at the beginning of the loop 'i' = 4 and the validation statement returns false.  Loop terminates


 */

public class Quiz15 {

    public static void main (String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        HashMap< Integer, Integer> hm = new HashMap<>();

        for ( int i = 0; i < 4; i++) {
            System.out.println(i);
            hm.put(i++, i++);
            hs.add(hm.get(i-1));
            hm.put(i, hm.get(i--));
        }

        System.out.println(hm);
        System.out.println(hs);

    }

}
