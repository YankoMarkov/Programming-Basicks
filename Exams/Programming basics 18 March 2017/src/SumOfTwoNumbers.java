import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int from = Integer.valueOf(scan.nextLine());
        int to = Integer.valueOf(scan.nextLine());
        int magicNumber = Integer.valueOf(scan.nextLine());
        int count = 0;
        int result = 0;

        for (int i = from; i <= to; i++) {
            if (result > 0) {
                break;
            }
            for (int j = from; j <= to; j++) {
                count++;
                if (i + j == magicNumber) {
                    result = i + j;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, magicNumber);
                    break;
                }
            }
        }
        if (result == 0) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
