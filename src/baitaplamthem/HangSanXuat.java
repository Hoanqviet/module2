package baitaplamthem;

public class HangSanXuat {
    private String maHang;
    private String tenHang;
    private String tenQuocGia;

    public HangSanXuat(String maHang,String tenHang, String tenQuocGia) {
        this.maHang=maHang;
        this.tenHang=tenHang;
        this.tenQuocGia=tenQuocGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }


}
