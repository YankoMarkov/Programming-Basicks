
import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = input.nextLine();
        int days = input.nextInt();

        if (month.equals("May") || month.equals("October")) {
            if (days > 7 && days < 14) {
                double studio = (50 - (50 * 0.05)) * days;
                double apartment = 65 * days;
                System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartment, studio);
            } else if (days > 14) {
                double studio = (50 - (50 * 0.3)) * days;
                double apartment = (65 - (65 * 0.1)) * days;
                System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartment, studio);
            } else {
                double studio = 50 * days;
                double apartment = 65 * days;
                System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartment, studio);
            }
        }
        if (month.equals("June") || month.equals("September")) {
            if (days > 14) {
                double studio = (75.2 - (75.2 * 0.2)) * days;
                double apartment = (68.7 - (68.7 * 0.1)) * days;
                System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartment, studio);
            } else {
                double studio = 75.2 * days;
                double apartment = 68.7 * days;
                System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartment, studio);
            }
        }
        if (month.equals("July") || month.equals("August")) {
            if (days > 14) {
                double studio = 76 * days;
                double apartment = (77 - (77 * 0.1)) * days;
                System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartment, studio);
            } else {
                double studio = 76 * days;
                double apartment = 77 * days;
                System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartment, studio);
            }
        }
    }
}
