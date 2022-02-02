import java.util.HashMap;

public class MyHash {
    static HashMap<Integer, String> hm = new HashMap<>();
    public static void main (String[] args) {
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");

        hm.remove("one");
        System.out.println(hm);
    }
}
