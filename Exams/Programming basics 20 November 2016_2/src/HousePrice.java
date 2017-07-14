
import java.util.Scanner;

public class HousePrice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double smallerRoom = Double.valueOf(scan.nextLine());
        double kitchen = Double.valueOf(scan.nextLine());
        double priceSquareMeter = Double.valueOf(scan.nextLine());

        double bathroom = smallerRoom / 2;
        double secondRoom = (0.1 * smallerRoom) + smallerRoom;
        double thirdRoom = (0.1 * secondRoom) + secondRoom;

        double allRooms = smallerRoom + bathroom + kitchen + secondRoom + thirdRoom;
        double area = allRooms + (0.05 * allRooms);

        double price = priceSquareMeter * area;
        System.out.printf("%.2f", price);
    }
}
