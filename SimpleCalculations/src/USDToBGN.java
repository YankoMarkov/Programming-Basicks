import java.util.Scanner;

public class USDToBGN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double usd = Double.valueOf(scan.nextLine());
        double bgn = usd * 1.79549;
        System.out.printf("%.2f BGN", bgn);
    }
}
