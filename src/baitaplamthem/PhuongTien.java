package baitaplamthem;

public abstract class PhuongTien {
    private String bienKiemSoat;
    private String tenHangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTien() {
    }
   public PhuongTien(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat=bienKiemSoat;
        this.tenHangSanXuat=tenHangSanXuat;
        this.namSanXuat=namSanXuat;
        this.chuSoHuu=chuSoHuu;
   }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }
  public abstract void hienThiThongTin();
}
