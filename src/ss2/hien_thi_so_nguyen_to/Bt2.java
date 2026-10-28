package ss2.hien_thi_so_nguyen_to;
import java.util.Scanner;
public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong : ");
        int numbers = scanner.nextInt();

        int count = 0;

        int N = 2;

        System.out.println(numbers + " so nguyen to dau tien la:");

        while (count < numbers) {
            boolean     soNguyento = true;

            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    soNguyento = false;
                    break;
                }
            }


            if (soNguyento) {
                System.out.print(N + " ");
                count++;
            }


            N++;
        }

        scanner.close();
    }
}
