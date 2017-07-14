
import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int adultsCount = Integer.valueOf(scan.nextLine());
        int studentsCount = Integer.valueOf(scan.nextLine());
        int sleepNightCount = Integer.valueOf(scan.nextLine());
        String transportType = scan.nextLine();

        double total = 0;

        switch (transportType) {
            case "train":
                if (adultsCount + studentsCount > 50) {
                    double transportPrice = (((adultsCount * 24.99) + (studentsCount * 14.99)) * 2) * 0.5;
                    double nightsPrice = sleepNightCount * 82.99;
                    double charge = (transportPrice + nightsPrice) * 0.1;
                    total = transportPrice + nightsPrice + charge;
                } else {
                    double transportPrice = (((adultsCount * 24.99) + (studentsCount * 14.99)) * 2);
                    double nightsPrice = sleepNightCount * 82.99;
                    double charge = (transportPrice + nightsPrice) * 0.1;
                    total = transportPrice + nightsPrice + charge;
                }
                break;
            case "bus": {
                double transportPrice = (((adultsCount * 32.5) + (studentsCount * 28.5)) * 2);
                double nightsPrice = sleepNightCount * 82.99;
                double charge = (transportPrice + nightsPrice) * 0.1;
                total = transportPrice + nightsPrice + charge;
                break;
            }
            case "boat": {
                double transportPrice = (((adultsCount * 42.99) + (studentsCount * 39.99)) * 2);
                double nightsPrice = sleepNightCount * 82.99;
                double charge = (transportPrice + nightsPrice) * 0.1;
                total = transportPrice + nightsPrice + charge;
                break;
            }
            case "airplane": {
                double transportPrice = (((adultsCount * 70) + (studentsCount * 50)) * 2);
                double nightsPrice = sleepNightCount * 82.99;
                double charge = (transportPrice + nightsPrice) * 0.1;
                total = transportPrice + nightsPrice + charge;
                break;
            }
        }
        System.out.printf("%.2f", total);
    }
}
