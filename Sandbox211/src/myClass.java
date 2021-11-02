public class myClass {

    public static void main (String[] args) {

        A a = new A();
        A b = new B();

        a.i = b.i;

        System.out.println(b.i);
        System.out.println(b.mult());
    }


}
