package ss1.bt1;
import java.util.Scanner;
public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten cua ban: ");
        String name = scanner.nextLine();
        System.out.println("hello" + name);
        scanner.close();
    }
}
