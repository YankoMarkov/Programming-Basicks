import java.util.Scanner;

public class CurrencyConverter1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double currency = Double.valueOf(scan.nextLine());
        String fromCurrency = scan.nextLine().toUpperCase();
        String toCurrency = scan.nextLine().toUpperCase();
        double bgn = 1;
        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;

        switch (fromCurrency) {
            case "BGN":
                currency *= bgn;
                break;
            case "USD" :
                currency *= usd;
                break;
            case "EUR" :
                currency *= eur;
                break;
            case "GBP" :
                currency *= gbp;
                break;
            default:
                break;
        }

        switch (toCurrency) {
            case "BGN":
                currency /= bgn;
                System.out.printf("%.2f BGN", currency);
                break;
            case "USD" :
                currency /= usd;
                System.out.printf("%.2f USD", currency);
                break;
            case "EUR" :
                currency /= eur;
                System.out.printf("%.2f EUR", currency);
                break;
            case "GBP" :
                currency /= gbp;
                System.out.printf("%.2f GBP", currency);
                break;
            default:
                break;
        }
    }
}
