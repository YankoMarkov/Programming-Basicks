
import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int middle = 5 * n - 2 * n;

        //Top
        for (int j = 0; j < n; j++)
            System.out.print(".");
        for (int j = 0; j < middle; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < n; j++) {
            System.out.print(".");
        }
        System.out.println();


        //Over middle
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(".");
            }
            System.out.print("*");
            for (int j = 0; j < middle; j++) {
                System.out.print(".");
            }
            System.out.print("*");
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(".");
            }
            middle += 2;
            System.out.println();
        }


        //Middle
        for (int i = 0; i < n * 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        middle -= 2;


        //Below middle
        for (int i = 0; i < 3 * n - n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(".");
            }
            System.out.print("*");
            for (int j = 0; j < middle; j++) {
                System.out.print(".");
            }
            System.out.print("*");
            for (int j = 0; j < i + 1; j++) {
                System.out.print(".");
            }
            middle -= 2;
            System.out.println();
        }


        //Base
        for (int i = 0; i < n * 2 + 1; i++) {
            System.out.print(".");
        }
        for (int i = 0; i < middle + 2; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < n * 2 + 1; i++) {
            System.out.print(".");
        }
    }
}
