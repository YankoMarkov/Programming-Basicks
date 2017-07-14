
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double count2 = 0;
        double count3 = 0;
        double count4 = 0;

        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                count2++;
            }
            if (num % 3 == 0) {
                count3++;
            }
            if (num % 4 == 0) {
                count4++;
            }
        }
        count2 = count2 * 100 / n;
        count3 = count3 * 100 / n;
        count4 = count4 * 100 / n;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%", count2, count3, count4);
    }
}
