
import java.util.Scanner;

public class MatchTickets {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double budget = Double.valueOf(input.nextLine());
        String category = input.nextLine();
        int peoples = Integer.valueOf(input.nextLine());

        if (peoples <= 4) {
            double budget1 = budget - (budget * 0.75);
            if (category.equals("VIP")) {
                double moneyTickets = peoples * 499.99;
                if (budget1 >= moneyTickets) {
                    double moneyLeft = budget1 - moneyTickets;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyNeed = Math.abs(moneyTickets - budget1);
                    System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
                }
            }
            if (category.equals("Normal")) {
                double moneyTickets = peoples * 249.99;
                if (budget1 >= moneyTickets) {
                    double moneyLeft = budget1 - moneyTickets;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyNeed = Math.abs(moneyTickets - budget1);
                    System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
                }
            }
        }
        if (peoples > 4 && peoples <= 9) {
            double budget1 = budget - (budget * 0.6);
            if (category.equals("VIP")) {
                double moneyTickets = peoples * 499.99;
                if (budget1 >= moneyTickets) {
                    double moneyLeft = budget1 - moneyTickets;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyNeed = Math.abs(moneyTickets - budget1);
                    System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
                }
            }
            if (category.equals("Normal")) {
                double moneyTickets = peoples * 249.99;
                if (budget1 >= moneyTickets) {
                    double moneyLeft = budget1 - moneyTickets;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyNeed = Math.abs(moneyTickets - budget1);
                    System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
                }
            }
        }
        if (peoples > 9 && peoples <= 24) {
            double budget1 = budget - (budget * 0.5);
            if (category.equals("VIP")) {
                double moneyTickets = peoples * 499.99;
                if (budget1 >= moneyTickets) {
                    double moneyLeft = budget1 - moneyTickets;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyNeed = Math.abs(moneyTickets - budget1);
                    System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
                }
            }
            if (category.equals("Normal")) {
                double moneyTickets = peoples * 249.99;
                if (budget1 >= moneyTickets) {
                    double moneyLeft = budget1 - moneyTickets;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyNeed = Math.abs(moneyTickets - budget1);
                    System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
                }
            }
        }
        if (peoples > 24 && peoples <= 49) {
            double budget1 = budget - (budget * 0.4);
            if (category.equals("VIP")) {
                double moneyTickets = peoples * 499.99;
                if (budget1 >= moneyTickets) {
                    double moneyLeft = budget1 - moneyTickets;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyNeed = Math.abs(moneyTickets - budget1);
                    System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
                }
            }
            if (category.equals("Normal")) {
                double moneyTickets = peoples * 249.99;
                if (budget1 >= moneyTickets) {
                    double moneyLeft = budget1 - moneyTickets;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyNeed = Math.abs(moneyTickets - budget1);
                    System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
                }
            }
        }
        if (peoples > 49) {
            double budget1 = budget - (budget * 0.25);
            if (category.equals("VIP")) {
                double moneyTickets = peoples * 499.99;
                if (budget1 >= moneyTickets) {
                    double moneyLeft = budget1 - moneyTickets;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyNeed = Math.abs(moneyTickets - budget1);
                    System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
                }
            }
            if (category.equals("Normal")) {
                double moneyTickets = peoples * 249.99;
                if (budget1 >= moneyTickets) {
                    double moneyLeft = budget1 - moneyTickets;
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                } else {
                    double moneyNeed = Math.abs(moneyTickets - budget1);
                    System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
                }
            }
        }
    }
}
