package ss5.access_modifier;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Hinh tron 1 - Ban kinh: " + c1.getRadius());
        System.out.println("Hinh tron 1 - Dien tich: " + c1.getArea());

        Circle c2 = new Circle(5.0);
        System.out.println("Hinh tron 2 - Ban kinh: " + c2.getRadius());
        System.out.println("Hinh tron 2 - Dien tich: " + c2.getArea());
    }
}
