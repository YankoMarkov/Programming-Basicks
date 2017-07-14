
import java.util.Scanner;

public class Stop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        int b = n;
        int c = (2 * n + 4) + (2 * n - 1);
        int a = 2 * n - 1;

        for (int i = 0; i < n + 1; i++) {
            System.out.print(".");
        }
        for (int i = 0; i < n * 2 + 1; i++) {
            System.out.print("_");
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.print(".");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(".");
            }
            System.out.print("//");
            for (int j = 0; j < a; j++) {
                System.out.print("_");
            }
            System.out.print("\\\\");
            for (int j = 0; j < b; j++) {
                System.out.print(".");
            }
            a += 2;
            b--;
            System.out.println();
            if (b == 0) {
                break;
            }
        }

        System.out.print("//");
        for (int j = 0; j < (c - 9) / 2; j++) {
            System.out.print("_");
        }
        System.out.print("STOP!");
        for (int j = 0; j < (c - 9) / 2; j++) {
            System.out.print("_");
        }
        System.out.print("\\\\");
        System.out.println();

        System.out.print("\\\\");
        for (int j = 0; j < c - 4; j++) {
            System.out.print("_");
        }
        System.out.print("//");
        System.out.println();

        b++;
        a -= 2;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < b; i++) {
                System.out.print(".");
            }
            System.out.print("\\\\");
            for (int i = 0; i < a; i++) {
                System.out.print("_");
            }
            System.out.print("//");
            for (int i = 0; i < b; i++) {
                System.out.print(".");
            }
            a -= 2;
            b++;
            System.out.println();
            if (b == n) {
                break;
            }
        }
    }
}
