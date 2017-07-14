
import java.util.Scanner;

public class ChristmasHat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        int wide = 4 * n + 1;

        for (int i = 0; i < (wide - 3) / 2; i++) {
            System.out.print(".");
        }
        System.out.print("/|\\");
        for (int i = 0; i < (wide - 3) / 2; i++) {
            System.out.print(".");
        }
        System.out.println();
        for (int i = 0; i < (wide - 3) / 2; i++) {
            System.out.print(".");
        }
        System.out.print("\\|/");
        for (int i = 0; i < (wide - 3) / 2; i++) {
            System.out.print(".");
        }
        System.out.println();
        int a = 0;
        int b = (wide - 3) / 2;
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(".");
            }
            System.out.print("*");
            for (int j = 0; j < a; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 0; j < a; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 0; j < b; j++) {
                System.out.print(".");
            }
            a++;
            b--;
            System.out.println();
        }
        for (int i = 0; i < wide; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < wide; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
        for (int i = 0; i < wide; i++) {
            System.out.print("*");
        }
    }
}
