import java.util.Scanner;

public class OddEvenSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.valueOf(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        int sum = evenSum;
        int diff = Math.abs(evenSum - oddSum);
        if (oddSum == evenSum) {
            System.out.printf("Yes, sum = %d", sum);
        } else {
            System.out.printf("No, diff = %d", diff);
        }
    }
}
