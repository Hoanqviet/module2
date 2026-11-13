package baitaplamthem;

public class Oto extends PhuongTien{
    private int soChoNgoi;
    private String kieuXe;
    public Oto(){

    }
    public Oto(String bienKiemSoat,String tenHangSanXuat, int namSanXuat,String chuSoHuu,String kieuXe,int soChoNgoi) {
        super(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu);
        this.kieuXe=kieuXe;
        this.soChoNgoi=soChoNgoi;

    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }
@Override
public void hienThiThongTin(){
    System.out.println("bks: " + getBienKiemSoat() + "hãng: " + getTenHangSanXuat() + "năm sx: " + getNamSanXuat() + "chủ sở hữu: " + getChuSoHuu() + "kiểu xe: " + kieuXe + "số chổ ngồi: " + soChoNgoi);
}
}
