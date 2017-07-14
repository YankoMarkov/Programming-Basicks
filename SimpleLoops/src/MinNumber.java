import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(scan.nextLine());
            if (num <= min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
