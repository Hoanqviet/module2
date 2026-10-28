package ss2.hien_thi_cac_loai_hinh;
import java.util.Scanner;
public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println("Menu:");
            System.out.println("1. In hcn");
            System.out.println("2. In 4 hinh tam giac vuong");
            System.out.println("3. In tam giac can");
            System.out.println("4. Thoat");
            System.out.print("Hay in hinh so: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangles();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("Thoat chuonng trinh");
                    break;
                default:
                    System.out.println("Chon tu 1 - 4");
            }
            System.out.println();
        } while (choice != 4);

        scanner.close();
    }

    // in hcn
    public static void printRectangle() {
        System.out.println("\nHinh chu nhat");
        int height = 3;
        int width = 7;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // in 4 tam giac
    public static void printSquareTriangles() {
        int height = 5;

        // tam giac vuong duoi - trai
        System.out.println("\nTam giac vuong goc duoi - ben trai");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // tam giac vuong tren - trai
        System.out.println("\ntam giac vuong tren - ben trai");
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // tam giac vuong duoi - phai
        System.out.println("\ntam giac vuong duoi - ben phai");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // tam giac vuong tren - phai
        System.out.println("\ntam giac vuong tren - ben phai");
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. in tam giac can
    public static void printIsoscelesTriangle() {
        System.out.println("\nTam giac can");
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
