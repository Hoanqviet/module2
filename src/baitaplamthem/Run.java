package baitaplamthem;


import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    private static ArrayList<XeTai> xeTaiList = new ArrayList<>();
    private static ArrayList<Oto> otoList = new ArrayList<>();
    private static ArrayList<XeMay> xeMayList = new ArrayList<>();
    private static ArrayList<HangSanXuat> hangSanXuatList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        khoiTaoDanhSachHang();
        khoiTaoDuLieuMau();

        int chon;
        do {
            System.out.println("\nCHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiện thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1:
                    themMoiPhuongTien();
                    break;
                case 2:
                    hienThiPhuongTien();
                    break;
                case 3:
                    xoaPhuongTien();
                    break;
                case 4:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        } while (chon != 4);
    }

    // Nạp danh sách hãng sản xuất theo đề bài
    private static void khoiTaoDanhSachHang() {
        hangSanXuatList.add(new HangSanXuat("HSX-001", "Yamaha", "Nhật Bản"));
        hangSanXuatList.add(new HangSanXuat("HSX-002", "Honda", "Nhật Bản"));
        hangSanXuatList.add(new HangSanXuat("HSX-003", "Dongfeng", "Trung Quốc"));
        hangSanXuatList.add(new HangSanXuat("HSX-004", "Huyndai", "Hàn Quốc"));
        hangSanXuatList.add(new HangSanXuat("HSX-005", "Ford", "Mỹ"));
        hangSanXuatList.add(new HangSanXuat("HSX-006", "Toyota", "Nhật Bản"));
        hangSanXuatList.add(new HangSanXuat("HSX-007", "Hino", "Nhật Bản"));
    }

    // Nạp một số dữ liệu mẫu theo gợi ý file đề bài
    private static void khoiTaoDuLieuMau() {
        xeTaiList.add(new XeTai("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3.0));
        otoList.add(new Oto("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", "Du lịch", 5));
        xeMayList.add(new XeMay("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100));
    }

    // Chọn hãng sản xuất từ danh sách
    private static String chonHangSanXuat() {
        System.out.println("--- Danh sách hãng sản xuất ---");
        for (int i = 0; i < hangSanXuatList.size(); i++) {
            System.out.println((i + 1) + ". " + hangSanXuatList.get(i).getTenHang() + " (" + hangSanXuatList.get(i).getTenQuocGia() + ")");
        }
        System.out.print("Chọn hãng (1-" + hangSanXuatList.size() + "): ");
        int chon = Integer.parseInt(scanner.nextLine());
        if (chon >= 1 && chon <= hangSanXuatList.size()) {
            return hangSanXuatList.get(chon - 1).getTenHang();
        }
        return hangSanXuatList.get(0).getTenHang();
    }

    // YÊU CẦU 1: Thêm mới phương tiện
    private static void themMoiPhuongTien() {
        System.out.println("\n--- CHỌN LOẠI PHƯƠNG TIỆN CẦN THÊM ---");
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ôtô");
        System.out.println("3. Thêm xe máy");
        System.out.print("Lựa chọn: ");
        int chon = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập biển kiểm soát: ");
        String bks = scanner.nextLine();

        String hang = chonHangSanXuat();

        System.out.print("Nhập năm sản xuất: ");
        int namSX = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();

        if (chon == 1) {
            System.out.print("Nhập tải trọng: ");
            double taiTrong = Double.parseDouble(scanner.nextLine());
            xeTaiList.add(new XeTai(bks, hang, namSX, chuSoHuu, taiTrong));
            System.out.println("Thêm xe tải thành công!");
        } else if (chon == 2) {
            System.out.print("Nhập kiểu xe (Du lịch / Xe khách): ");
            String kieuXe = scanner.nextLine();
            System.out.print("Nhập số chỗ ngồi: ");
            int soCho = Integer.parseInt(scanner.nextLine());
            otoList.add(new Oto(bks, hang, namSX, chuSoHuu, kieuXe, soCho));
            System.out.println("Thêm ô tô thành công!");
        } else if (chon == 3) {
            System.out.print("Nhập công suất: ");
            double congSuat = Double.parseDouble(scanner.nextLine());
            xeMayList.add(new XeMay(bks, hang, namSX, chuSoHuu, congSuat));
            System.out.println("Thêm xe máy thành công!");
        } else {
            System.out.println("Loại phương tiện không hợp lệ!");
        }
    }

    // YÊU CẦU 2: Hiển thị phương tiện
    private static void hienThiPhuongTien() {
        System.out.println("\n--- CHỌN LOẠI PHƯƠNG TIỆN CẦN HIỂN THỊ ---");
        System.out.println("1. Hiện thị xe tải");
        System.out.println("2. Hiện thị ôtô");
        System.out.println("3. Hiện xe máy");
        System.out.print("Lựa chọn: ");
        int chon = Integer.parseInt(scanner.nextLine());

        if (chon == 1) {
            System.out.println("\n=== DANH SÁCH XE TẢI ===");
            if (xeTaiList.isEmpty()) {
                System.out.println("Danh sách trống!");
            } else {
                for (XeTai xt : xeTaiList) {
                    xt.hienThiThongTin();
                }
            }
        } else if (chon == 2) {
            System.out.println("\n=== DANH SÁCH Ô TÔ ===");
            if (otoList.isEmpty()) {
                System.out.println("Danh sách trống!");
            } else {
                for (Oto oto : otoList) {
                    oto.hienThiThongTin();
                }
            }
        } else if (chon == 3) {
            System.out.println("\n=== DANH SÁCH XE MÁY ===");
            if (xeMayList.isEmpty()) {
                System.out.println("Danh sách trống!");
            } else {
                for (XeMay xm : xeMayList) {
                    xm.hienThiThongTin();
                }
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    // YÊU CẦU 3: Xóa phương tiện theo biển kiểm soát
    private static void xoaPhuongTien() {
        System.out.print("\nNhập biển kiểm soát phương tiện cần xóa: ");
        String bks = scanner.nextLine();

        PhuongTien ptCanXoa = null;
        int loaiXe = 0; // 1: Xe tải, 2: Ô tô, 3: Xe máy

        // Tìm trong danh sách Xe tải
        for (XeTai xt : xeTaiList) {
            if (xt.getBienKiemSoat().equalsIgnoreCase(bks)) {
                ptCanXoa = xt;
                loaiXe = 1;
                break;
            }
        }

        // Tìm trong danh sách Ô tô
        if (ptCanXoa == null) {
            for (Oto oto : otoList) {
                if (oto.getBienKiemSoat().equalsIgnoreCase(bks)) {
                    ptCanXoa = oto;
                    loaiXe = 2;
                    break;
                }
            }
        }

        // Tìm trong danh sách Xe máy
        if (ptCanXoa == null) {
            for (XeMay xm : xeMayList) {
                if (xm.getBienKiemSoat().equalsIgnoreCase(bks)) {
                    ptCanXoa = xm;
                    loaiXe = 3;
                    break;
                }
            }
        }

        // Nếu tìm thấy
        if (ptCanXoa != null) {
            System.out.print("Bạn có chắc chắn muốn xóa phương tiện có BKS " + bks + " không? (Yes/No): ");
            String xacNhan = scanner.nextLine();

            if (xacNhan.equalsIgnoreCase("Yes")) {
                if (loaiXe == 1) {
                    xeTaiList.remove((XeTai) ptCanXoa);
                } else if (loaiXe == 2) {
                    otoList.remove((Oto) ptCanXoa);
                } else if (loaiXe == 3) {
                    xeMayList.remove((XeMay) ptCanXoa);
                }
                System.out.println("Đã xóa thành công!");
                System.out.println("Nhấn Enter để quay lại menu chính...");
                scanner.nextLine();
            } else {
                System.out.println("Hủy thao tác xóa!");
            }
        } else {
            System.out.println("Không tìm thấy phương tiện có biển kiểm soát: " + bks);
        }
    }
}