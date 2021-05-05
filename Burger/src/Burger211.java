import java.util.ArrayList;

public abstract class Burger211 {

    ArrayList<BurgerInfo> Burger = new ArrayList<>();

    Burger211() {

        BurgerInfo b1 = new BurgerInfo();
        b1.name = "inheritance Burger";
        b1.price = 3.0;
        b1.topping = "beef patty, tomato, onion, ranch source";
        Burger.add(b1);

        
    }

}
