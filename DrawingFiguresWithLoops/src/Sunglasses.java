import java.util.Scanner;

public class Sunglasses {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        String space = " ";
        String dash = "|";
        int a = n / 2;

        stars(n);
        fig1(space, n);
        stars(n);
        System.out.println();
        for (int i = 1; i <= n - 2; i++) {
            if (n % 2 == 0) {
                if (i == a - 1) {
                    fig(n);
                    fig1(dash, n);
                    fig(n);
                } else {
                    fig(n);
                    fig1(space, n);
                    fig(n);
                }
            } else {
                if (i == a) {
                    fig(n);
                    fig1(dash, n);
                    fig(n);
                } else {
                    fig(n);
                    fig1(space, n);
                    fig(n);
                }
            }
            System.out.println();
        }
        stars(n);
        fig1(space, n);
        stars(n);
    }

    private static void fig(int n) {
        System.out.print("*");
        for (int i = 0; i < 2 * n - 2; i++) {
            System.out.print("/");
        }
        System.out.print("*");
    }

    private static void fig1(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }

    private static void stars(int n) {
        for (int j = 0; j < 2 * n; j++) {
            System.out.print("*");
        }
    }
}
