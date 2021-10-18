public class B extends A {

    int i = 1;

    B() {
        super.i++;
        this.i++;
        System.out.println("B");
    }

}
