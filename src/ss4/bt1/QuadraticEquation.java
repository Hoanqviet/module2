package ss4.bt1;
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
    private double getDiscriminant(){
        return b * 2 - (4 * a * c);
    }
    private double getN1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        } return (-b - Math.pow(delta, 0.5)) / (2*a);

    }
    private double getN2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        } return (-b - Math.pow(delta, 0.5)) / (2*a);
    }

    public void gpt(){
        double delta = this.getDiscriminant();

        if (delta > 0) {
            System.out.println("pt co 2 nghiem: " + this.getN1() + " va " + this.getN2());
        } else if (delta == 0) {
            System.out.println("pt co 1 nghiem " + this.getN1());
        } else {
            System.out.println("pt k co nghiem");
        }
    }
}
