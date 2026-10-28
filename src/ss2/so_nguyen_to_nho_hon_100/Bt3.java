package ss2.so_nguyen_to_nho_hon_100;

public class Bt3 {
    public static boolean Songuyento(int A) {
        if (A < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 100 :");

        for (int i = 2; i < 100; i++) {
            if (Songuyento(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
