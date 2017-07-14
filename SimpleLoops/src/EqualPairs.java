import java.util.Scanner;

public class EqualPairs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        int maxDiff = 0;
        int diff = 0;
        int value = 0;
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            int sum2 = 0;
            for (int j = 0; j < 2; j++) {
                int num = Integer.valueOf(scan.nextLine());
                sum2 += num;
            }
            if (i == 0) {
                sum1 = sum2;
                value = sum2;
            } else if (i > 0) {
                if (sum1 == sum2) {
                    value = sum2;
                    diff = Math.abs(sum1 - sum2);
                } else {
                    diff = Math.abs(sum1 - sum2);
                }
                if (maxDiff < diff) {
                    maxDiff = diff;
                }
            }
            sum1 = sum2;
        }
        if (diff == 0) {
            System.out.printf("Yes, value=%d", value);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
