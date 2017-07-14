
import java.util.Scanner;

public class BikeRace {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberJuniors = Integer.valueOf(scan.nextLine());
        int numberSeniors = Integer.valueOf(scan.nextLine());
        String layout = scan.nextLine();
        double feeJuniors = 0;
        double feeSeniors = 0;
        double sum = 0;
        double sumAfterTax = 0;

        switch (layout) {
            case "trail":
                feeJuniors = 5.50;
                feeSeniors = 7.0;
                sum = (numberJuniors * feeJuniors) + (numberSeniors * feeSeniors);
                sumAfterTax = sum - (sum * 0.05);
                break;
            case "cross-country":
                feeJuniors = 8.0;
                feeSeniors = 9.50;
                sum = (numberJuniors * feeJuniors) + (numberSeniors * feeSeniors);
                if (numberJuniors + numberSeniors >= 50) {
                    sum = sum - (sum * 0.25);
                }
                sumAfterTax = sum - (sum * 0.05);
                break;
            case "downhill":
                feeJuniors = 12.25;
                feeSeniors = 13.75;
                sum = (numberJuniors * feeJuniors) + (numberSeniors * feeSeniors);
                sumAfterTax = sum - (sum * 0.05);
                break;
            case "road":
                feeJuniors = 20.0;
                feeSeniors = 21.50;
                sum = (numberJuniors * feeJuniors) + (numberSeniors * feeSeniors);
                sumAfterTax = sum - (sum * 0.05);
                break;
            default:
                break;
        }
        System.out.printf("%.2f", sumAfterTax);
    }
}
