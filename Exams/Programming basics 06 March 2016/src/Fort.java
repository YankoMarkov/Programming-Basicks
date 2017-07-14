
import java.util.Scanner;

public class Fort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        int a = (2 * n - 4) - ((n / 2) * 2);

        System.out.print("/");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("^");
        }
        System.out.print("\\");
        for (int i = 0; i < a; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("^");
        }
        System.out.print("\\");
        System.out.println();

        for (int i = 0; i < n - 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 2 * n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.print("|");
        for (int i = 0; i < n / 2; i++) {
            System.out.print(" ");
        }
        System.out.print(" ");
        for (int i = 0; i < a; i++) {
            System.out.print("_");
        }
        System.out.print(" ");
        for (int i = 0; i < n / 2; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();

        System.out.print("\\");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        for (int i = 0; i < a; i++) {
            System.out.print(" ");
        }
        System.out.print("\\");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        System.out.println();
    }
}
