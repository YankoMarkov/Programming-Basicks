import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPosition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        double evenSum = 0;
        double oddSum = 0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        for (int i = 1; i <= n; i++) {
            double num = Double.valueOf(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }
            } else {
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.printf("OddSum=%s,\n", df.format(oddSum));
        if (oddMin == 1000000000.0) {
            System.out.println("OddMin=No");
        } else {
            System.out.printf("OddMin=%s,\n", df.format(oddMin));
        }
        if (oddMax == -1000000000.0) {
            System.out.println("OddMax=No");
        } else {
            System.out.printf("OddMax=%s,\n", df.format(oddMax));
        }
        System.out.printf("EvenSum=%s,\n", df.format(evenSum));
        if (evenMin == 1000000000.0) {
            System.out.println("EvenMin=No");
        } else {
            System.out.printf("EvenMin=%s,\n", df.format(evenMin));
        }
        if (evenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%s\n", df.format(evenMax));
        }
    }
}
