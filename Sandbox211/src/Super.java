public class Super {
    int num = 1;
    int id =2;
}

class Sub extends Super {

    int num = 3;

    public void display() {
        System.out.println(num);
        System.out.println(super.num);
        System.out.println(id);
    }
}


