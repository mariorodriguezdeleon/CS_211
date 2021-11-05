public class ParentChildTest {

    public static void main(String[] args) {

        Child c = new Child();
        c.output();

        c.num = 5;

        c.output();
    }
}
