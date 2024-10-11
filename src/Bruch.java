import java.beans.beancontext.BeanContext;

public class Bruch {
    private int a = 0;
    private int b = 0;

    public Bruch(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double toDecimal(){
        return a / b;
    }

    public Bruch multiplacte(Bruch b){
        return new Bruch(b.a * b.a, b.b * b.b);
    }

    public Bruch multiplacte(Bruch b1, Bruch b2){
        return new Bruch(b1.a * b2.a, b1.b * b2.b);
    }

    public void print(){
        System.out.println(a + " / " + b);
    }

    public static void main(String[] args) {
        Bruch b1 = new Bruch(1, 4);
        Bruch b2 = new Bruch(1, 2);

        Bruch b3 = b1.multiplacte(b1);
        b3.print();
        Bruch b4 = b1.multiplacte(b1, b2);
        b4.print();


    }
}
