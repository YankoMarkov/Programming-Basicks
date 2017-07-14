import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double currency = Double.valueOf(scan.nextLine());
        String fromCurrency = scan.nextLine().toUpperCase();
        String toCurrency = scan.nextLine().toUpperCase();
        double bgn = 1;
        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;


        if (fromCurrency.equals("USD") && toCurrency.equals("BGN")) {
            currency *= usd;
            double result = currency / bgn;
            System.out.printf("%.2f BGN", result);
        }
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            currency *= usd;
            double result = currency / eur;
            System.out.printf("%.2f EUR", result);
        }
        if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
            currency *= usd;
            double result = currency / gbp;
            System.out.printf("%.2f GBP", result);
        }
        if (fromCurrency.equals("BGN") && toCurrency.equals("USD")) {
            currency *= bgn;
            double result = currency / usd;
            System.out.printf("%.2f USD", result);
        }
        if (fromCurrency.equals("BGN") && toCurrency.equals("EUR")) {
            currency *= bgn;
            double result = currency / eur;
            System.out.printf("%.2f EUR", result);
        }
        if (fromCurrency.equals("BGN") && toCurrency.equals("GBP")) {
            currency *= bgn;
            double result = currency / gbp;
            System.out.printf("%.2f GBP", result);
        }
        if (fromCurrency.equals("EUR") && toCurrency.equals("BGN")) {
            currency *= eur;
            double result = currency / bgn;
            System.out.printf("%.2f BGN", result);
        }
        if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            currency *= eur;
            double result = currency / usd;
            System.out.printf("%.2f USD", result);
        }
        if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
            currency *= eur;
            double result = currency / gbp;
            System.out.printf("%.2f GBP", result);
        }
        if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
            currency *= gbp;
            double result = currency / eur;
            System.out.printf("%.2f EUR", result);
        }
        if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
            currency *= gbp;
            double result = currency / usd;
            System.out.printf("%.2f USD", result);
        }
        if (fromCurrency.equals("GBP") && toCurrency.equals("BGN")) {
            currency *= gbp;
            double result = currency / bgn;
            System.out.printf("%.2f BGN", result);
        }
    }
}
