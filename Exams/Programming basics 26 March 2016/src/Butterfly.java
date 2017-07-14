
import java.util.Scanner;

public class Butterfly {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        for (int i = 1; i <= n - 2; i++) {
            if (i % 2 != 0) {
                stars(n);
            } else if (i % 2 == 0) {
                dash(n);
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("@");
        System.out.println();
        for (int i = 1; i <= n - 2; i++) {
            if (i % 2 != 0) {
                stars(n);
            } else if (i % 2 == 0) {
                dash(n);
            }
        }
    }

    private static void stars(int n) {
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
        }
        System.out.print("\\ /");
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void dash(int n) {
        for (int i = 0; i < n - 2; i++) {
            System.out.print("-");
        }
        System.out.print("\\ /");
        for (int i = 0; i < n - 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

