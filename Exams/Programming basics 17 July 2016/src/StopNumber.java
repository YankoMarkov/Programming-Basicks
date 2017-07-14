
import java.util.Scanner;

public class StopNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int s = input.nextInt();

        for (int i = m; i >= n; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (i == s) {
                    break;
                }
                System.out.printf("%d ", i);
            }
        }
    }
}
