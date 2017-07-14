
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int l = input.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (char k = 97; k < (97 + l) ; k++) {
                    for (char m = 97; m < (97 + l) ; m++) {
                        for (int o = Math.max(i, j) + 1; o <= n ; o++) {
                            System.out.printf("%d%d%c%c%d ", i, j, k, m, o);
                        }
                    }
                }
            }
        }
    }
}
