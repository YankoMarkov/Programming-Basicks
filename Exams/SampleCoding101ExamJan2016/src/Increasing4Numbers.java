
import java.util.Scanner;

public class Increasing4Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.valueOf(scan.nextLine());
        int b = Integer.valueOf(scan.nextLine());

        for (int i = a; i <= b; i++) {
            for (int j = i + 1; j <= b; j++) {
                for (int k = j + 1; k <= b; k++) {
                    for (int l = k + 1; l <= b; l++) {
                        System.out.printf("%d %d %d %d", i, j, k, l);
                        System.out.println();
                    }
                }
            }
        }
    }
}
