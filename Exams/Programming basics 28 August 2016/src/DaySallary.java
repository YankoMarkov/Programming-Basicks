
import java.util.Scanner;

public class DaySallary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayInMonths = input.nextInt();
        double moneyParDay = input.nextDouble();
        double exchange = input.nextDouble();

        double moneyParMonth = dayInMonths * moneyParDay;
        double moneyParEar = moneyParMonth * 12 + 2.5 * moneyParMonth;
        double tax = 0.25 * moneyParEar;
        double afterTaxMoney = moneyParEar - tax;
        double aftetTaxMoneyBg = afterTaxMoney * exchange;
        double daySallary = aftetTaxMoneyBg / 365;
        System.out.printf("%.2f", daySallary);
    }
}
