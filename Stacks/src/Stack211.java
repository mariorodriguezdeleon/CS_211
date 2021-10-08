/* Mario Rodriguez, CS 211
 * 980384835
 * May 27, 2021
 * Bellevue College
 * Stack211 Calculator -
 * Description:
 * A generic stack class
 *
 */

import java.util.ArrayList;

public class Stack211 <T>{

    static int stackTop;
    ArrayList<T> myStack = new ArrayList<T>();

    Stack211() {
        stackTop = -1;
    }

    public void push (T c) {
        stackTop ++;
        myStack.add(c);
    }

    public T pop () {
        T c = myStack.remove(stackTop);
        stackTop--;
        return c;
    }

    public T read() {
        T c = myStack.get(stackTop);
        return c;
    }

    public boolean isEmpty () {
        if (stackTop < 0) {
            return true;
        } else {
            return false;
        }
    }

}
