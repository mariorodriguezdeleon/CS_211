/* Mario Rodriguez, CS 211
 * 980384835
 * June 14, 2021
 * Bellevue College
 * Min Priority-Queue and Heap -
 * Description:
 * This program is used to test Heap211.  It instantiates a Heap211 object and performs Add() and Remove() on the heap.
 * The program generates randomly a 0 or a 1 to choose between the Adding or Remove calls and prints the status of the
 * heap after every call.  The number of the tests can be adjusted to increase or decrease the number of test performed
 * on the heap.  Enjoy!
 */
import java.util.*;

public class myHeap {

    public static void main (String[] args) {

        int howManyTests = 10;
        Random random = new Random();
        Heap211 myTree = new Heap211();

        for (int test = 1; test <= howManyTests; test++) {

            int action = random.nextInt(2);

            if (action == 0) {
                int node = random.nextInt(100);
                //add
                myTree.add(node);
                //Print current Heap
                System.out.print(test + " Add " + node + ":" );
                System.out.println(myTree);
            }

            if (action == 1) {
                //if heap is empty, skip this action, do not count this action
                if (myTree.getSize() != 0) {
                    int result = myTree.remove();
                    System.out.print(test + " Removed " + result + ":");
                    System.out.println(myTree);
                } else {
                    int node = random.nextInt(100);
                    myTree.add(node);
                    //Print current Heap
                    System.out.print(test + " Add " + node + ":" );
                    System.out.println(myTree);
                }
            }
        }
    }

}
