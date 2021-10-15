public class Chicken extends Animal{

    String name;
    String sound = "cackle";

    public Chicken (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sound () {
        System.out.println(sound);
    }

}
