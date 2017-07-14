import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(scan.nextLine());
            if (num >= max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
