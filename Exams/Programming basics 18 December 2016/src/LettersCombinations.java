
import java.util.Scanner;

public class LettersCombinations {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char from = scan.nextLine().charAt(0);
        char to = scan.nextLine().charAt(0);
        char letter = scan.nextLine().charAt(0);
        int count = 0;
        StringBuilder result = new StringBuilder();

        for (char i = from; i <= to; i++) {
            for (char j = from; j <= to; j++) {
                for (char k = from; k <= to; k++) {
                    if (letter != i && letter != j && letter != k) {
                        result = result.append(String.format("%c%c%c ", i, j, k));
                        count++;
                    }
                }
            }
        }
        System.out.printf("%s%d", result, count);
    }
}