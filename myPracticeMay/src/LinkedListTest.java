import java.util.*;

public class LinkedListTest {

    public static void main (String[] args) {

        //Create a linked-list object
        LinkedList<String> list = new LinkedList<>();

        //Add elements to the list in first position
        list.add("CS210"); list.add("CS211"); list.add("CS212");
        System.out.println(list.toString());

        //Add element to the first position
        list.addFirst("First Element");

        //Add elements to the last position
        list.addLast("Last Element");

        //Add to the third element of the list
        list.add(2, "3rd Element");

        System.out.println(list.toString());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
