
import java.util.Scanner;

public class Trip {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double budget = Double.parseDouble(input.nextLine());
        String season = input.nextLine();

        if (budget <= 100) {
            if (season.equals("summer")) {
                double price = budget * 0.30;
                System.out.printf("Somewhere in Bulgaria\nCamp - %.2f", price);
            } else {
                double price = budget * 0.70;
                System.out.printf("Somewhere in Bulgaria\nHotel - %.2f", price);
            }
        }
        if (budget <= 1000 && budget > 100) {
            if (season.equals("summer")) {
                double price = budget * 0.40;
                System.out.printf("Somewhere in Balkans\nCamp - %.2f", price);
            } else {
                double price = budget * 0.80;
                System.out.printf("Somewhere in Balkans\nHotel - %.2f", price);
            }
        }
        if (budget > 1000) {
            double price = budget * 0.90;
            System.out.printf("Somewhere in Europe\nHotel - %.2f", price);
        }
    }
}
