
import java.util.Scanner;

public class Pets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.valueOf(scan.nextLine());
        int kiloFood = Integer.valueOf(scan.nextLine());
        double dogKiloFood = Double.valueOf(scan.nextLine());
        double catKiloFood = Double.valueOf(scan.nextLine());
        double turtleGramFood = Double.valueOf(scan.nextLine());

        double dogNeedFood = dogKiloFood * days;
        double catNeedFood = catKiloFood * days;
        double turtleNeedFood = (turtleGramFood / 1000) * days;
        double foodNeed = dogNeedFood + catNeedFood + turtleNeedFood;

        if (foodNeed <= kiloFood) {
            double total = kiloFood - foodNeed;
            System.out.printf("%.0f kilos of food left.\n", Math.floor(total));
        } else {
            double total = foodNeed - kiloFood;
            System.out.printf("%.0f more kilos of food are needed.\n", Math.ceil(total));
        }
    }
}
