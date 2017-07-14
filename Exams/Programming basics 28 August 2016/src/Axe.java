
import java.util.Scanner;

public class Axe {

    static int n;
    static int handleLength;
    static int hammerWidth;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = Integer.valueOf(scan.nextLine());
        handleLength = n * 3;
        printTop();
        printHandle();
        if (n / 2 > 1) {
            printUnderHandle();
        }
        printBase();
    }

    private static void printBase() {
        for (int j = 0; j < n * 3 - n / 2 + 1; j++) {
            System.out.print("-");
        }
        for (int j = 0; j < hammerWidth + 2; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < n - n / 2; j++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private static void printUnderHandle() {
        for (int i = 0; i < n / 2 - 1; i++) {
            for (int j = 0; j < n * 3 - i; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 0; j < hammerWidth; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 0; j < (n * 2 - 2) / 2 - i; j++) {
                System.out.print("-");
            }
            System.out.println();
            hammerWidth += 2;
        }
    }

    private static void printHandle() {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n * 3; j++) {
                System.out.print("*");
            }
            System.out.print("*");
            for (int j = 0; j < hammerWidth; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 0; j < (n * 2 - 2) / 2; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    private static void printTop() {
        for (hammerWidth = 0; hammerWidth < n; hammerWidth++) {
            for (int j = 0; j < n * 3; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 0; j < hammerWidth; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 0; j < n * 2 - 2 - hammerWidth; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        hammerWidth--;
    }
}
