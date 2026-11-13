package baitaplamthem;

public class XeMay extends PhuongTien{
    private double congSuat;
    public  XeMay(){

    }
 public XeMay(String bienKiemSoat,String tenHangSanXuat,int namSanXuat,String chuSoHuu,double congSuat) {
     super(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu);
     this.congSuat=congSuat;
 }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    @Override
    public void hienThiThongTin(){
        System.out.println("bks: " + getBienKiemSoat() + "hãng: " + getTenHangSanXuat() + "năm sx: " + getNamSanXuat() + "chủ sở hữu: " + getChuSoHuu() + "công suất: " + congSuat);
    }
}
