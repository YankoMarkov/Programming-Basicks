
import java.util.Scanner;

public class SumsStep3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            int num = Integer.valueOf(scan.nextLine());
            if (count == 1) {
                sum1 += num;
            } else if (count == 2) {
                sum2 += num;
            } else if (count == 3) {
                sum3 += num;
                count = 0;
            }
        }
        System.out.printf("sum1 = %d\nsum2 = %d\nsum3 = %d", sum1, sum2, sum3);
    }
}
