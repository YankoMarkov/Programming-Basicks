
import java.util.Scanner;

public class TransportPrice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Kilometers: ");
        int n = input.nextInt();
        System.out.print("Enter day or night: ");
        String d = input.next();
        double taxyPriceDay = 0.70 + (0.79 * n);
        double taxyPriceNight = 0.70 + (0.90 * n);
        double busPrice = 0.09 * n;
        double traynPrice = 0.06 * n;
        if (n < 20) {
            if (d.equals("day")) {
                System.out.println(taxyPriceDay);
            } else if (d.equals("night")) {
                System.out.println(taxyPriceNight);
            }
        }
        if (n >= 20 && n < 100) {
            System.out.println(busPrice);
        }
        if (n >= 100) {
            System.out.println(traynPrice);
        }
    }
}
