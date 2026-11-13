package ss6.lopCycle_va_lopCylinder;

public class Run {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.toString());

        Circle c2 = new Circle(3.5, "blue");
        System.out.println(c2.toString());


        Cylinder cy1 = new Cylinder();
        System.out.println(cy1.toString());

        Cylinder cy2 = new Cylinder(2.0, 5.0, "green");
        System.out.println(cy2.toString());
    }
}
