
import java.util.Scanner;

public class SmartLilly {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double a = input.nextDouble();
        int b = input.nextInt();

        int moneyCount = 0;
        int moneyCount1 = 0;
        int toyCount = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                moneyCount++;
                moneyCount1 += 10 * moneyCount;
            } else {
                toyCount++;
            }
        }

        int money = moneyCount1 - moneyCount;
        int toy = toyCount * b;
        int sum = money + toy;

        if (sum >= a) {
            double summ = (double) sum - a;
            System.out.printf("Yes! %.2f", summ);
        } else {
            double summ1 = a - (double) sum;
            System.out.printf("No! %.2f", summ1);
        }
    }
}
