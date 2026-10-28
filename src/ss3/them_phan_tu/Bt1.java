package ss3.them_phan_tu;
import java.util.Scanner;
public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 10;
        int[] array = new int[N];

        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;

        System.out.print("nhap mang ban dau: ");
        printArray(array);

        System.out.print("nhap gia tri can chen: ");
        int X = scanner.nextInt();

        System.out.print("nhap vi tri  can chen (0 den " + (N - 1) + "): ");
        int index = scanner.nextInt();

        if (index <= -1 || index >= array.length - 1) {
            System.out.println("khong chen duoc");
        } else {

            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = X;

           System.out.print("mang sau khi chen: ");
            printArray(array);
        }

        scanner.close();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
