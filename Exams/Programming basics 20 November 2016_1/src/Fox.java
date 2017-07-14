
import java.util.Scanner;

public class Fox {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        int a = n * 2 - 1;
        int b = n;
        int c = n * 2 - 1;
        int d = 0;
        if (n / 2 <= 3) {
            d = 2;
        } else {
            d = 3;
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < j + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\\");
            for (int k = j; k < a; k++) {
                System.out.print("-");
            }
            a--;
            System.out.print("/");
            for (int k = 0; k < j + 1; k++) {
                for (int l = k; l < k + 1; l++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < d; i++) {
            System.out.print("|");
            for (int j = 0; j < n / 2 + i; j++) {
                System.out.print("*");
            }
            System.out.print("\\");
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            b -= 2;
            System.out.print("/");
            for (int j = 0; j < n / 2 + i; j++) {
                System.out.print("*");
            }
            System.out.print("|");
            System.out.println();
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < j + 1; k++) {
                System.out.print("-");
            }
            System.out.print("\\");
            for (int k = j; k < c; k++) {
                System.out.print("*");
            }
            c--;
            System.out.print("/");
            for (int k = 0; k < j + 1; k++) {
                for (int l = k; l < k + 1; l++) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
