


public class AnimalSoundSystemMain {

    public static void main (String[] args) {

        Animal[] myAnimals = {
                new Cat("Coco"),
                new Cat("Lazy"),
                new Dog("Max"),
                new Dog("Buddy"),
                new Chicken("Fried")
                };

        for (int i = 0; i < myAnimals.length; i++) {

            System.out.print(myAnimals[i].getName() + " ");
            myAnimals[i].sound();

        }

    }

}
