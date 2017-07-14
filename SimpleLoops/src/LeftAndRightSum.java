import java.util.Scanner;

public class LeftAndRightSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(scan.nextLine());
            firstSum += num;
        }
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(scan.nextLine());
            secondSum += num;
        }
        int sum = firstSum;
        int diff = Math.abs(firstSum - secondSum);
        if (firstSum == secondSum) {
            System.out.printf("Yes, sum = %d", sum);
        } else {
            System.out.printf("No, diff = %d", diff);
        }
    }
}
