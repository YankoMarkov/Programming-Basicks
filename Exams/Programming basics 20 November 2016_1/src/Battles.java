
import java.util.Scanner;

public class Battles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int player1Pokemon = Integer.valueOf(scan.nextLine());
        int player2Pokemon = Integer.valueOf(scan.nextLine());
        int battlesCount = Integer.valueOf(scan.nextLine());

        for (int i = 1; i <= player1Pokemon; i++) {
            for (int j = 1; j <= player2Pokemon; j++) {
                if (battlesCount == 0) {
                    break;
                }
                System.out.printf("(%d <-> %d) ", i, j);
                battlesCount--;
            }
        }
    }
}
