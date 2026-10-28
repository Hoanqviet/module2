package ss4;
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return b * 2 - (4 * a * c);
    }
    public double getN1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        } return (-b - Math.pow(delta, 0.5)) / (2*a);

    }
    public double getN2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        } return (-b - Math.pow(delta, 0.5)) / (2*a);
    }
}
