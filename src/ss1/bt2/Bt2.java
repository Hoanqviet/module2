package ss1.bt2;
import java.util.Scanner;
public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 25000;
        System.out.println("nhap so tien USD: ");
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println("so tien da quy doi :" + vnd + "VND");
        scanner.close();
    }
}
