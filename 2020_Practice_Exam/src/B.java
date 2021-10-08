public class B extends A {

    static int i = 1;

    B() {
        this.i = super.i*2;
    }
    public int mult() {
        return super.i*this.i;
    }
}
