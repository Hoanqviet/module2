package ss1;
import java.util.Scanner;
public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten cua ban: ");
        String name = scanner.nextLine();
        System.out.println("hello" + name);
        scanner.close();
    }
}
