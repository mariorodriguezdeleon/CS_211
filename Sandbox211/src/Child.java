public class Child extends Parent {
    int num = 2;

    public void output() {
        System.out.println(super.num);
        System.out.println(this.num);
    }
}


