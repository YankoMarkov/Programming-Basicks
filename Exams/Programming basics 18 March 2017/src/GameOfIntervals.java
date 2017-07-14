import java.util.Scanner;

public class GameOfIntervals {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gameTurns = Integer.valueOf(scan.nextLine());
        int turn1 = 0;
        int turn2 = 0;
        int turn3 = 0;
        int turn4 = 0;
        int turn5 = 0;
        int turn6 = 0;
        double result = 0;

        for (int i = 0; i < gameTurns; i++) {
            int turns = Integer.valueOf(scan.nextLine());
            if (turns >= 0 && turns <= 9) {
                result += (double)turns * 0.2;
                turn1 ++;
            } else if (turns >= 10 && turns <= 19) {
                result += (double)turns * 0.3;
                turn2 ++;
            } else if (turns >= 20 && turns <= 29) {
                result += (double)turns * 0.4;
                turn3 ++;
            } else if (turns >= 30 && turns <= 39) {
                result += 50.0;
                turn4 ++;
            } else if (turns >= 40 && turns <= 50) {
                result += 100.0;
                turn5 ++;
            } else if (turns > 50 || turns < 0) {
                result = result / 2.0;
                turn6 ++;
            }
        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", (double)turn1 / gameTurns * 100.0);
        System.out.printf("From 10 to 19: %.2f%%%n", (double)turn2 / gameTurns * 100.0);
        System.out.printf("From 20 to 29: %.2f%%%n", (double)turn3 / gameTurns * 100.0);
        System.out.printf("From 30 to 39: %.2f%%%n", (double)turn4 / gameTurns * 100.0);
        System.out.printf("From 40 to 50: %.2f%%%n", (double)turn5 / gameTurns * 100.0);
        System.out.printf("Invalid numbers: %.2f%%%n", (double)turn6 / gameTurns * 100.0);
    }
}
