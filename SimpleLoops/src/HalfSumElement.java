import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        int tempSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(scan.nextLine());
            tempSum += num;
            if (num >= max) {
                max = num;
            }
        }
        int sum = tempSum - max;
        int diff = Math.abs(max - sum);
        if (max == sum) {
            System.out.printf("Yes\nSum = %d", max);
        } else {
            System.out.printf("No\nDiff = %d", diff);
        }
    }
}
