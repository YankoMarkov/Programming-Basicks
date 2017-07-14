
import java.util.Scanner;

public class ChangeTiles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.valueOf(scan.nextLine());
        double wideFloor = Double.valueOf(scan.nextLine());
        double highFloor = Double.valueOf(scan.nextLine());
        double sideTriangle = Double.valueOf(scan.nextLine());
        double highTriangle = Double.valueOf(scan.nextLine());
        double tilePrice = Double.valueOf(scan.nextLine());
        double payWorker = Double.valueOf(scan.nextLine());

        double floorArea = wideFloor * highFloor;
        double triangleArea = (sideTriangle * highTriangle) / 2;
        double tileNeed = Math.ceil(floorArea / triangleArea) + 5;
        double tilePriceSum = tilePrice * tileNeed;
        double moneyLeft = money - payWorker;
         if (moneyLeft >= tilePriceSum) {
             double result = moneyLeft - tilePriceSum;
             System.out.printf("%.2f lv left.", result);
         } else {
             double result = tilePriceSum - moneyLeft;
             System.out.printf("You'll need %.2f lv more.", result);
         }

    }
}
