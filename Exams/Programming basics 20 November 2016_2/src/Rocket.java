
import java.util.Scanner;

public class Rocket {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        int wide = 3 * n;
        int a = 2;
        int b = 2;

        for (int i = 0; i < (wide / 2) - 1; i++) {
            System.out.print(".");
        }
        System.out.print("/\\");
        for (int i = 0; i < (wide / 2) - 1; i++) {
            System.out.print(".");
        }
        System.out.println();

        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < (wide / 2) - a; i++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int i = 0; i < b; i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int i = 0; i < (wide / 2) - a; i++) {
                System.out.print(".");
            }
            a++;
            b += 2;
            System.out.println();
        }

        a--;
        b -= 2;
        for (int i = 0; i < (wide / 2) - a; i++) {
            System.out.print(".");
        }
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < (wide / 2) - a; i++) {
            System.out.print(".");
        }
        System.out.println();
        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < (wide / 2) - a; j++) {
                System.out.print(".");
            }
            System.out.print("|");
            for (int j = 0; j < b; j++) {
                System.out.print("\\");
            }
            System.out.print("|");
            for (int j = 0; j < (wide / 2) - a; j++) {
                System.out.print(".");
            }
            System.out.println();
        }

        for (int i = 0; i < n /2; i++) {
            for (int j = 0; j < (wide / 2) - a; j++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.print("\\");
            for (int j = 0; j < (wide / 2) - a; j++) {
                System.out.print(".");
            }
            a++;
            b += 2;
            System.out.println();
        }


    }
}
