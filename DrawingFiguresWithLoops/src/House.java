import java.util.Scanner;

public class House {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        int stars = 2;
        int stars1 = 1;
        int line = (n - 2) / 2;
        int line1 = (n - 1) / 2;
        for (int i = 0; i < (n + 1) / 2; i++) {
            if (n % 2 == 0) {
                roof(stars, line);
            } else {
                roof(stars1, line1);
            }
            line--;
            stars += 2;
            line1--;
            stars1 += 2;
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.print("|");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("*");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    private static void roof(int stars, int line) {
        for (int j = 0; j < line; j++) {
            System.out.print("-");
        }
        for (int j = 0; j < stars; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < line; j++) {
            System.out.print("-");
        }
    }
}
