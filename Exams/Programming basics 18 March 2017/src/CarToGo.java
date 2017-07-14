import java.util.Scanner;

public class CarToGo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.valueOf(scan.nextLine());
        String season = scan.nextLine();

        switch (season) {
            case "Summer":
                if (budget > 0 && budget <= 100) {
                    System.out.println("Economy class");
                    double price = 35 * budget / 100.0;
                    System.out.printf("Cabrio - %.2f%n", price);
                }
                if (budget > 100 && budget <= 500) {
                    System.out.println("Compact class");
                    double price = 45 * budget / 100.0;
                    System.out.printf("Cabrio - %.2f%n", price);
                }
                if (budget > 500) {
                    System.out.println("Luxury class");
                    double price = 90 * budget / 100.0;
                    System.out.printf("Jeep - %.2f%n", price);
                }
                break;
            case "Winter":
                if (budget > 0 && budget <= 100) {
                    System.out.println("Economy class");
                    double price = 65 * budget / 100.0;
                    System.out.printf("Jeep - %.2f%n", price);
                }
                if (budget > 100 && budget <= 500) {
                    System.out.println("Compact class");
                    double price = 80 * budget / 100.0;
                    System.out.printf("Jeep - %.2f%n", price);
                }
                if (budget > 500) {
                    System.out.println("Luxury class");
                    double price = 90 * budget / 100.0;
                    System.out.printf("Jeep - %.2f%n", price);
                }
                break;
        }
    }
}
