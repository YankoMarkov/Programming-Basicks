
import java.util.Scanner;

public class Flowers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberChrysanthemums = Integer.valueOf(scan.nextLine());
        int numberRoses = Integer.valueOf(scan.nextLine());
        int numberTulips = Integer.valueOf(scan.nextLine());
        String season = scan.nextLine();
        String holiday = scan.nextLine();
        double priceChrysanthemumsSpringSummer = 0;
        double PriceChrysanthemumsAutumnWinter = 0;
        double priceRosesSpringSummer = 0;
        double priceRosesAutumnWinter = 0;
        double priceTulipsSpringSummer = 0;
        double priceTulipsAutumnWinter = 0;
        double sumFlowers = numberChrysanthemums + numberRoses + numberTulips;
        double sumPriceFlowers = 0;

        switch (season) {
            case "Spring":
                priceChrysanthemumsSpringSummer = 2.0 * numberChrysanthemums;
                priceRosesSpringSummer = 4.10 * numberRoses;
                priceTulipsSpringSummer = 2.50 * numberTulips;
                sumPriceFlowers = priceChrysanthemumsSpringSummer + priceRosesSpringSummer + priceTulipsSpringSummer;
                if (holiday.equals("Y")) {
                    sumPriceFlowers = sumPriceFlowers + (sumPriceFlowers * 0.15);
                    if (sumFlowers > 20) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.20);
                    }
                    if (numberTulips > 7) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.05);
                    }

                } else if (holiday.equals("N")) {
                    sumPriceFlowers = sumPriceFlowers;
                    if (sumFlowers > 20) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.20);
                    }
                    if (numberTulips > 7) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.05);
                    }

                }
                break;
            case "Summer":
                priceChrysanthemumsSpringSummer = 2.0 * numberChrysanthemums;
                priceRosesSpringSummer = 4.10 * numberRoses;
                priceTulipsSpringSummer = 2.50 * numberTulips;
                sumPriceFlowers = priceChrysanthemumsSpringSummer + priceRosesSpringSummer + priceTulipsSpringSummer;
                if (holiday.equals("Y")) {
                    sumPriceFlowers = sumPriceFlowers + (sumPriceFlowers * 0.15);
                    if (sumFlowers > 20) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.20);
                    }
                } else if (holiday.equals("N")) {
                    sumPriceFlowers = sumPriceFlowers;
                    if (sumFlowers > 20) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.20);
                    }
                }
                break;
            case "Autumn":
                PriceChrysanthemumsAutumnWinter = 3.75 * numberChrysanthemums;
                priceRosesAutumnWinter = 4.50 * numberRoses;
                priceTulipsAutumnWinter = 4.15 * numberTulips;
                sumPriceFlowers = PriceChrysanthemumsAutumnWinter + priceRosesAutumnWinter + priceTulipsAutumnWinter;
                if (holiday.equals("Y")) {
                    sumPriceFlowers = sumPriceFlowers + (sumPriceFlowers * 0.15);
                    if (sumFlowers > 20) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.20);
                    }
                } else if (holiday.equals("N")) {
                    sumPriceFlowers = sumPriceFlowers;
                    if (sumFlowers > 20) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.20);
                    }
                }
                break;
            case "Winter":
                PriceChrysanthemumsAutumnWinter = 3.75 * numberChrysanthemums;
                priceRosesAutumnWinter = 4.50 * numberRoses;
                priceTulipsAutumnWinter = 4.15 * numberTulips;
                sumPriceFlowers = PriceChrysanthemumsAutumnWinter + priceRosesAutumnWinter + priceTulipsAutumnWinter;
                if (holiday.equals("Y")) {
                    sumPriceFlowers = sumPriceFlowers + (sumPriceFlowers * 0.15);
                    if (sumFlowers > 20) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.20);
                    }
                    if (numberRoses >= 10) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.10);
                    }

                } else if (holiday.equals("N")) {
                    sumPriceFlowers = sumPriceFlowers;
                    if (sumFlowers > 20) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.20);
                    }
                    if (numberRoses >= 10) {
                        sumPriceFlowers = sumPriceFlowers - (sumPriceFlowers * 0.10);
                    }
                }
                break;
            default:
                break;
        }
        System.out.printf("%.2f", sumPriceFlowers + 2);
    }
}
