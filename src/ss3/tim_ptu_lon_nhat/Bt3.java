package ss3.tim_ptu_lon_nhat;
import java.util.Scanner;
public class Bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so dong: ");
        int r = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int c = sc.nextInt();

        double[][] a = new double[r][c];

        System.out.println("Nhap cac phan tu cho ma tran:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextDouble();
            }
        }

        double max = a[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Phan tu lon nhat trong ma tran la: " + max);
        System.out.println("Toa do (dong, cot): [" + maxRow + "][" + maxCol + "]");

        sc.close();
    }
}
