package ss5.quan_ly_san_pham;

import java.util.Scanner;
import java.util.ArrayList;

public class ProductManager {
    private static ArrayList<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"ss",3444));
        productList.add(new Product(2,"ss",3444));
        productList.add(new Product(3,"ss",3444));
    }
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Quan Ly San Pham");
            System.out.println("1.Thêm mới");
            System.out.println("2.Hiển thị danh sách");
            System.out.println("3.Cập nhật thông tin sản phẩm");
            System.out.println("4.Xóa sản phẩm");
            System.out.println("5.Thoát");
            System.out.print("Chọn chức năng: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    createProduct();
                    break;

                case 2:
                    readProducts();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                default:
                    System.out.println("Vui long chon chuc nang phu hop (1-5)");
            }
        } while (choice != 4);
    }

    public static void createProduct() {
        System.out.println("Thêm sản phẩm mới");
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (findProductById(id) != null) {
            System.out.println("Id đã tồn tại");
            return;
        }
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name, price);
        productList.add(product);
        System.out.println("Thêm sản phẩm thành công");
    }

    public static void readProducts() {
        System.out.println("Danh Sách Sản Phẩm");
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm đang trống");
            return;
        }
        for (Product p : productList) {
            p.displayData();
        }
    }

    public static void updateProduct() {
        System.out.println("Cập nhật sản phẩm");
        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());

        Product product = findProductById(id);
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm có ID = " + id);
            return;
        }

        System.out.print("Nhập tên mới (Tên hiện tại: " + product.getName() + "): ");
        String newName = scanner.nextLine();
        System.out.print("Nhập giá mới (Giá hiện tại: " + product.getPrice() + "): ");
        double newPrice = Double.parseDouble(scanner.nextLine());

        product.setName(newName);
        product.setPrice(newPrice);
        System.out.println("Cập nhật thông tin sản phẩm thành công");
    }

    public static void deleteProduct() {
        System.out.println("Xóa sản phẩm");
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());

        Product product = findProductById(id);
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm có ID = " + id);
            return;
        }

        productList.remove(product);
        System.out.println("Xóa sản phẩm thành công");
    }

    private static Product findProductById(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

}
