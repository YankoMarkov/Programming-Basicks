import java.util.Scanner;

public class SoftUniLogo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        int wide = (12 * n) - 5;
        int h = 4 * n - 2;
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < (wide / 2) - a; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < b + c * 2; j++) {
                System.out.print("#");
            }
            for (int j = 0; j < (wide / 2) - a; j++) {
                System.out.print(".");
            }
            c += 3;
            a += 3;
            System.out.println();
        }
        for (int j = 0; j < wide; j++) {
            System.out.print("#");
        }
        System.out.println();
        for (int i = 0; i < h - 3 * n; i++) {
            System.out.print("|");
            a -= 3;
            c -= 3;
            for (int j = 0; j < (wide / 2) - a - 1; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < b + c * 2; j++) {
                System.out.print("#");
            }
            for (int j = 0; j < (wide / 2) - a; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print("|");
            a -= 3;
            c -= 3;
            for (int j = 0; j < (wide / 2) - a - 1; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < b + c * 2; j++) {
                System.out.print("#");
            }
            for (int j = 0; j < (wide / 2) - a; j++) {
                System.out.print(".");
            }
            a += 3;
            c += 3;
            System.out.println();
        }
        System.out.print("@");
        a -= 3;
        c -= 3;
        for (int j = 0; j < (wide / 2) - a - 1; j++) {
            System.out.print(".");
        }
        for (int j = 0; j < b + c * 2; j++) {
            System.out.print("#");
        }
        for (int j = 0; j < (wide / 2) - a; j++) {
            System.out.print(".");
        }
    }
}

