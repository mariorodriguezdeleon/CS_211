import java.util.ArrayList;

public class Burger {
    private String name;
    private double price;

    Burger(String name, double price){
        this.name=name;
        this.price=price;
    }

    public void setName (String nm) {
        this.name = nm;
    }

    public void setPrice (double p) {
        this.price = p;
    }

    public String getName () {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
}

