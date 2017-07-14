import java.util.Scanner;

public class CakeTycoon {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cakesAmountWants = Integer.valueOf(scan.nextLine());
        double floursKilogramsNeeded = Double.valueOf(scan.nextLine());
        double floursKilogramAvailable = Integer.valueOf(scan.nextLine());
        double trufflesAmountAvailable = Integer.valueOf(scan.nextLine());
        double trufflePrice = Integer.valueOf(scan.nextLine());

        int cakes = (int)(floursKilogramAvailable / floursKilogramsNeeded);

        if (cakes >= cakesAmountWants) {
            double truffleCost = trufflesAmountAvailable * trufflePrice;
            double cakesPrice = truffleCost / cakesAmountWants;
            double cakesPriceTotal = cakesPrice * 1.25;
            System.out.printf("All products available, price of a cake: %.2f", cakesPriceTotal);
        } else {
            double flourRequired = cakesAmountWants * floursKilogramsNeeded;
            double moreFloursKilogramsNeeded = flourRequired - floursKilogramAvailable;
            System.out.printf("Can make only %d cakes, need %.2f kg more flour", cakes, moreFloursKilogramsNeeded);
        }
    }
}
