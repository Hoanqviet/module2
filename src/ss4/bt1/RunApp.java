package ss4;
import java.util.Scanner;
public class RunApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation ptrinh = new QuadraticEquation(a, b, c);

        double delta = ptrinh.getDiscriminant();

        if (delta > 0) {
            System.out.println("pt co 2 nghiem: " + ptrinh.getN1() + " va " + ptrinh.getN2());
        } else if (delta == 0) {
            System.out.println("pt co 1 nghiem " + ptrinh.getN1());
        } else {
            System.out.println("pt k co nghiem");
        }

        scanner.close();
    }
    }
