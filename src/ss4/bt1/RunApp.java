package ss4.bt1;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation ptrinh = new QuadraticEquation(a, b, c);
        ptrinh.gpt();
        ptrinh.gpt();

        //
        int x = 3;
        int y = 3;
        int z = 3;
        QuadraticEquation ptrinh2 = new QuadraticEquation(a, b, c);
        ptrinh2.gpt();

    }
}
