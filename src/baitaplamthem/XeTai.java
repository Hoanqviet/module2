package baitaplamthem;

public class XeTai extends PhuongTien {
    private double taiTrong;

    public XeTai(){

    }
    public XeTai(String bienKiemSoat,String tenHangSanXuat,int namSanXuat, String chuSoHuu,double taiTrong){
        super(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu);
        this.taiTrong=taiTrong;
    }

    public double getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(double taiTrong) {
        this.taiTrong = taiTrong;
    }
@Override
public void hienThiThongTin() {
    System.out.println("bks: " + getBienKiemSoat() + "hãng: " + getTenHangSanXuat() + "năm sx: " + getNamSanXuat() + "chủ sở hữu: " + getChuSoHuu() + "tải trọng: " + taiTrong );
}
}

