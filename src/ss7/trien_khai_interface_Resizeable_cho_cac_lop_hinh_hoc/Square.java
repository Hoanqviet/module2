package ss7.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class Square implements  Resizeable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        side = side + side * percent / 100;
    }
}
