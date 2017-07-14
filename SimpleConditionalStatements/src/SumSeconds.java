import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.valueOf(scan.nextLine());
        int b = Integer.valueOf(scan.nextLine());
        int c = Integer.valueOf(scan.nextLine());
        int sum = a + b + c;

        if (sum > 0 && sum < 60) {
            System.out.printf("0:%02d", sum);
        } else if (sum >= 60 && sum < 120) {
            System.out.printf("1:%02d", sum - 60);
        } else if (sum >= 120 && sum < 180) {
            System.out.printf("2:%02d", sum - 120);
        }
    }
}
