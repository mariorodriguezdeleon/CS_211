/* Mario Rodriguez, CS 211
 * 980384835
 * May 5, 2021
 * Bellevue College
 * Burger211 Abstract Class -
 * Description:
 * Burger211.java is an abstract class that helps define the burger object for Burger211 franchises.
 * The inner class, BurgerInfo defines three variables for the burger name, toppings and price.
 * The abstract class contains four (4) public concrete classes and two (2) abstract classes; this class
 * also contains a private ArrayList and a function that generates three (3) burger objects
 */
import java.util.*;

class BurgerInfo {
    String name;
    String topping;
    double price;
}

public abstract class Burger211 {

    private ArrayList<BurgerInfo> Burger = new ArrayList<>();

    Burger211() {

        BurgerInfo b1 = new BurgerInfo();
        b1.name = "Inheritance Burger";
        b1.price = 3.0;
        b1.topping = "beef patty, tomato, onion, ranch sauce";
        Burger.add(b1);

        BurgerInfo b2 = new BurgerInfo();
        b2.name = "Overriding Burger";
        b2.price = 2.0;
        b2.topping = "beef patty, lime, onion, lettuce, ranch sauce";
        Burger.add(b2);

        BurgerInfo b3 = new BurgerInfo();
        b3.name = "Polymorphism Burger";
        b3.price = 3.50;
        b3.topping = "chicken breast, gallo, onion, ranch sauce";
        Burger.add(b3);

    }

    public String getBurgerName (int b) {
        return Burger.get(b).name;
    }

    public double getBurgerPrice (int b) {
        return Burger.get(b).price;
    }

    public String getBurgerTopping(int b) {
        return Burger.get(b).topping;
    }

    public int getHowManyBurgers() {
        return  Burger.size();
    }

    abstract void Menu(String franchise);

    abstract void Promotion(Double discountRate, String promote);

}