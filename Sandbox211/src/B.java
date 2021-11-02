public class B extends A {

    int i = 3;

    B() {
        this.i = super.i * 2;
    }

    public int mult() {
        return super.i * this.i;
    }

}
