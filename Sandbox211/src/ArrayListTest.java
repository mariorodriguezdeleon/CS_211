import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListTest {

    public static void main (String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        HashSet<Integer> hs = new HashSet<Integer>();

        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();



        for (int i= 0; i<2; i++) {

            al.add(i);

            al.add(i+1);

            hs.add(i);

            hs.add(i+1);

            hm.put(al.get(i), al.get(i+1));

            hm.put(hm.get(i), hm.get(i+1));

        }



        System.out.println(al);

        System.out.println(hs);

        System.out.println(hm); // {key=value}.
    }

}
