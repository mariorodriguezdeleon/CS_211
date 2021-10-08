import java.awt.*;

public class q3 {

    public static void main (String[] args) {

        A a = new A();
        A b = new B();

        a.i= 5;
        System.out.println(b.i);
//        System.out.println(b.mult());
    }


//    public static void main(String[] args) {
//
//        A a = new A();
//        System.out.println(a.i);
//
//        A b = new B();
//        System.out.println(a.i);
//
//        System.out.println(b.i);
//
////        forLoop(25);
////        recursiveLoop(25);
//    }
//
//    public static void forLoop (int n) {
//        for (int i = 0; i < n; i+=2) {
//            System.out.println(i);
//        }
//    }

//    public static void recursiveLoop (int n) {
//        //if n == 0 -> print n
//        //else call recursiveLoop( n - 2)
//        //print n;
//
//        if (n < 1) {
//            System.out.println(0);
//        } else if (n % 2 == 0) {
//
//            recursiveLoop(n - 2);
//            System.out.println(n);
//
//        } else {
//            recursiveLoop(n - 1);
//        }
//    }
}
