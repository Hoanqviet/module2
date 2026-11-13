package ss7.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;
import java.util.Random;
public class Run {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Rectangle r = new Rectangle(6, 8);
        Square s = new Square(6);

        Random rd = new Random();

        double p1 = rd.nextInt(100) + 1;
        System.out.println("Hinh tron - Dien tich cu: " + c.getArea());
        c.resize(p1);
        System.out.println("Tang " + p1 + "% -> Dien tich moi: " + c.getArea());

        double p2 = rd.nextInt(100) + 1;
        System.out.println("Hinh chu nhat - Dien tich cu: " + r.getArea());
        r.resize(p2);
        System.out.println("Tang " + p2 + "% -> Dien tich moi: " + r.getArea());

        double p3 = rd.nextInt(100) + 1;
        System.out.println("Hinh vuong - Dien tich cu: " + s.getArea());
        s.resize(p3);
        System.out.println("Tang " + p3 + "% -> Dien tich moi: " + s.getArea());
    }
}
