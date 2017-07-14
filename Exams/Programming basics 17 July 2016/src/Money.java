
import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bitcoin = Integer.valueOf(input.nextLine());
        double chinaYuan = Double.valueOf(input.nextLine());
        double fee = Double.valueOf(input.nextLine());

        double percentFee = fee / 100;
        int exchangeBitcoin = bitcoin * 1168;
        double exchangeYuan = chinaYuan * 0.15 * 1.76;
        double sum = (exchangeBitcoin + exchangeYuan) / 1.95;
        double sumWithTax = sum - (sum * percentFee);

        String output = Double.toString(sumWithTax);
        int commaIndex = output.indexOf('.');
        String formatterPattern = "#.";
        int maxSize = sumWithTax < 1 ? 15 : 14;
        for (int i = commaIndex; i <= maxSize; i++) {
            formatterPattern += "#";
        }
        DecimalFormat df = new DecimalFormat(formatterPattern);
        System.out.print(df.format(sumWithTax));
    }
}
