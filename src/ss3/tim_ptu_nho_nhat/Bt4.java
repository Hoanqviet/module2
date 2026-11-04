package ss3.tim_ptu_nho_nhat;
import java.util.Scanner;
public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int SIZE = 5;
        int[] arr = new int[SIZE];

        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la: " + min);
    }
}
