
import java.util.Scanner;

public class BackToThePast {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        int year = input.nextInt();
        int personYear = 17;

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                personYear++;
                money -= 12000;
            } else {
                personYear++;
                money -= 12000 + 50 * personYear;
            }
        }
        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
