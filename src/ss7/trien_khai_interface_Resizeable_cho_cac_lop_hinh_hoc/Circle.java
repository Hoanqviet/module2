package ss7.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class Circle implements Resizeable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void resize(double percent) {
        radius = radius + radius * percent / 100;
    }
}
