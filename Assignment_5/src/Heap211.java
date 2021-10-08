/* Mario Rodriguez, CS 211
 * 980384835
 * June 14, 2021
 * Bellevue College
 * Min Priority-Queue and Heap -
 * Description:
 * This program is an implementation of a Min - Heap which maintains a vertical ordering of parents and children.
 * It utilizes an array as the data structure to store the nodes and leaves.  It provides methods for traversing the
 * tree. adding new leaves, removing min value and maintaining the structure need to be a min-heap.  This program
 * does not contain a main() and it is used by other programs to instantiate a Min-Heap object
 */

import java.util.Arrays;

public class Heap211 {

    private int[] elementData;
    private int size;

    public Heap211() {
        elementData = new int[10];
        size = 0;
    }

    // helpers for navigating indexes up/down the tree ================================
    private int parent(int index) {
        return index / 2;
    }

    private int leftChild(int index) {
        return index * 2;
    }

    private int rightChild(int index) {
        return (index * 2) + 1;
    }

    private boolean hasParent(int index) {
        return index > 1;
    }

    private boolean hasLeftChild(int index) {
        return leftChild(index) <= size;
    }

    private boolean hasRightChild(int index) {
        return rightChild(index) <= size;
    }

    private int peek() {
        return elementData[1];
    }

    private void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    // Getters and Setters to update the tree ===============================================

    // Adds the given element to this queue
    public void add(int value) {

        elementData[size + 1] = value;

        // "bubble up" as necessary to fix ordering
        int index = size + 1;
        boolean found = false;

        while (!found && hasParent(index)) {

            int parent = parent(index);

            if (elementData[index] < elementData[parent]) {
                swap(elementData, index, parent(index));
                index = parent(index);
            } else {
                found = true; // found proper location; stop the loop
            }
        }

        size++;

        if (size + 1 >= elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length * 2);
        }

    }

    // Removes the min value at the root node
    public int remove() {

        // move rightmost leaf to become new root
        int result = peek();
        elementData[1] = elementData[size];
        size--;

        // "bubble down" as necessary to fix ordering
        int index = 1;
        boolean found = false;

        while (!found && hasLeftChild(index)); {

            int left = leftChild(index);
            int right = rightChild(index);
            int child = left;

            if(hasRightChild(index) && elementData[right] < elementData[left]) {
                child = right;
            }

            if (elementData[index] > elementData[child]) {
                swap(elementData, index, child);
                index = child;
            } else {
                found = true; // found proper location; stop the loop
            }
        }
        return result;
    }

    public String toString() {

        String str = "[";

        for (int i = 1; i <= size; i++) {

            str += String.valueOf(elementData[i]) ;

            if (i < size) {
                str += ",";
            }
        }
        str += "]";

        return str;
    }

    public int getSize() {
        return size;
    }
}
