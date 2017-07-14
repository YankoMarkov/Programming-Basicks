
import java.util.Scanner;

public class Logistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberShipment = Integer.valueOf(scan.nextLine());
        double tonBus = 0;
        double tonTruck = 0;
        double tonTrain = 0;

        for (int i = 0; i < numberShipment; i++) {
            int shipment = Integer.valueOf(scan.nextLine());
            if (shipment <= 3) {
                tonBus += shipment;
            } else if (shipment >= 4 && shipment <= 11) {
                tonTruck += shipment;
            } else {
                tonTrain += shipment;
            }
        }
        double sumTons = tonBus + tonTruck + tonTrain;
        double averagePrice = (tonBus * 200 + tonTruck * 175 + tonTrain * 120) / sumTons;
        double busPercent = tonBus / sumTons * 100;
        double truckPercent = tonTruck / sumTons * 100;
        double trainPercent = tonTrain / sumTons * 100;
        System.out.printf("%.2f\n%.2f%%\n%.2f%%\n%.2f%%\n", averagePrice, busPercent, truckPercent, trainPercent);
    }
}
