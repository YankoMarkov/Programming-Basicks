
import java.util.Scanner;

public class Harvest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        double y = input.nextDouble();
        int z= input.nextInt();
        int n = input.nextInt();

        double grapes = x * y;
        double litersWine = (grapes * 0.4) / 2.5;

        if (litersWine >= z) {
            double wine = litersWine - z;
            double winePerson = wine / n;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n" +
                    " %.0f liters left -> %.0f liters per person.", Math.floor(litersWine), wine, Math.ceil(winePerson));

        } else {
            double wine = z - litersWine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wine));
        }

    }
}
