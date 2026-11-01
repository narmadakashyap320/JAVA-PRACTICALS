import java.io.Serializable;

public class AdditionBean implements Serializable {

    private int a;
    private int b;

    public AdditionBean() {
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getSum() {
        return a + b;
    }
}
