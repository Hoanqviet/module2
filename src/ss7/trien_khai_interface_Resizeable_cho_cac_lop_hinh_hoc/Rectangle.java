package ss7.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class Rectangle implements Resizeable{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    @Override
    public void resize(double percent) {
        width = width + width * percent / 100;
        length = length + length * percent / 100;
    }
}
