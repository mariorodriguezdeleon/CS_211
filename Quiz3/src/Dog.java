

public class Dog extends Animal{

    String name;
    String sound = "bow-wow";

    public Dog (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sound () {
        System.out.println(sound);
    }

}
