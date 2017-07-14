
import java.util.Scanner;

public class PerfectDiamond {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        String[] bottom = new String[n];
        int a = n - 1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(top(a, b));
            bottom[i] = top(a, b);
            a--;
            b += 2;
        }
        for (int i = bottom.length - 2; i >= 0; i--) {
            System.out.println(bottom[i]);
        }
    }

    private static String top(int a, int b) {
        String result = "";
        for (int j = 0; j < a; j++) {
            result += " ";
        }
        for (int j = 1; j <= b; j++) {
            if (j % 2 == 0) {
                result += "-";
            } else {
                result += "*";
            }
        }
        return result;
    }
}
