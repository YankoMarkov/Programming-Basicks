
import java.util.Scanner;

public class FlowerShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberMagnolias = Integer.valueOf(scan.nextLine());
        int numberHyacints = Integer.valueOf(scan.nextLine());
        int numberRoses = Integer.valueOf(scan.nextLine());
        int numberCactuses = Integer.valueOf(scan.nextLine());
        double giftPrice = Double.valueOf(scan.nextLine());

        double magnoliasPrice = 3.25;
        double hyacintsPrice = 4.0;
        double rousesPrice = 3.5;
        double cactusesPrice = 8.0;

        double magnolias = numberMagnolias * magnoliasPrice;
        double hyacints = numberHyacints * hyacintsPrice;
        double roses = numberRoses * rousesPrice;
        double cactuses = numberCactuses * cactusesPrice;
        double sum = magnolias + hyacints + roses + cactuses;
        double sumAfterTax = sum - (sum * 0.05);

        if (sumAfterTax >= giftPrice) {
            double result = sumAfterTax - giftPrice;
            System.out.printf("She is left with %.0f leva.", Math.floor(result));
        } else {
            double result = giftPrice - sumAfterTax;
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(result));
        }
    }
}
