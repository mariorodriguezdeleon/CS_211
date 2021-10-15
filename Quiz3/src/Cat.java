public class Cat extends Animal{

    String name;
    String sound = "Meow";

    public Cat (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sound () {
        System.out.println(sound);
    }

}
