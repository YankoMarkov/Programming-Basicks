import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(scan.nextLine());
            sum += num;
        }
        System.out.println(sum);
    }
}
