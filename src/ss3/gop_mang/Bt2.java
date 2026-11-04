package ss3.gop_mang;
import java.util.Scanner;
public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang 1: ");
           int size1 = scanner.nextInt();
            int[] array1 = new int[size1];

         System.out.print("Nhap kich thuoc mang 2: ");
             int size2 = scanner.nextInt();
         int[] array2 = new int[size2];

        System.out.println("Nhap phan tu cho mang 1");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("array1[" + i + "] = ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Nhap phan tu cho mang 2");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("array2[" + i + "] = ");
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            array3[array1.length + j] = array2[j];
        }

        System.out.print("Mang 3 sau khi gop: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
