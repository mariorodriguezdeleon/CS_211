import java.util.ArrayList;

public class q2 {

    public static void main(String[] args) {

        ArrayList<Burger> myBurger = new ArrayList<>();
        Burger burger = new Burger("burger", 2);
        burger.setName("burger1");
        burger.setPrice(1.5);
        myBurger.add(burger);

        for (Burger value : myBurger) {
            System.out.println(value.getName() + " " + value.getPrice());
        }
    }
}
