
import java.util.Scanner;

public class IncreasingElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        int tempNum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(scan.nextLine());
            if (tempNum < num) {
                count++;
            }
            tempNum = num;
        }
        System.out.println(count);
    }
}
