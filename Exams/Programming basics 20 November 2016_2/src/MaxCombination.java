
import java.util.Scanner;

public class MaxCombination {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int from = Integer.valueOf(scan.nextLine());
        int to = Integer.valueOf(scan.nextLine());
        int maxCombination = Integer.valueOf(scan.nextLine());
        int count = 0;

        for (int i = from; i <= to; i++) {
            if (count == maxCombination) {
                break;
            }
            for (int j = from; j <= to; j++) {
                System.out.printf("<%d-%d>", i, j);
                count++;
                if (count == maxCombination) {
                    break;
                }
            }
        }
    }
}
