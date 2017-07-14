
import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        for (int i = 0; i < a + b; i++) {
            for (int j = 0; j < a + c; j++) {
                if (n % 5 == 0) {
                    n = n - a;
                } else if (n % 3 == 0) {
                    n = n - b;
                } else {
                    n = n + c;
                }
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
