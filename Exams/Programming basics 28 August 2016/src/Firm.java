
import java.util.Scanner;

public class Firm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        int days = input.nextInt();
        int staf = input.nextInt();

        double workHours = 8 * (days - (0.1 * days));
        double overtime = staf * (2 * days);
        int sumHours = (int) (workHours + overtime);

        if (sumHours >= hours) {
            int a = (int) sumHours - hours;
            System.out.printf("Yes!%d hours left.", a);
        } else {
            int b = (int) (hours - sumHours);
            System.out.printf("Not enough time!%d hours needed.", b);
        }
    }
}
