
import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speed = Integer.valueOf(scan.nextLine());
        int firstTime = Integer.valueOf(scan.nextLine());
        int secondTime = Integer.valueOf(scan.nextLine());
        int thirdTime = Integer.valueOf(scan.nextLine());

        double firstTimeH = firstTime / 60.0;
        double secondTimeH = secondTime / 60.0;
        double thirdTimeH = thirdTime / 60.0;

        double distance = speed * firstTimeH;
        double increasedDistance = speed + (speed * 0.10);
        double firstDistance = increasedDistance * secondTimeH;
        double reducedDistance = increasedDistance - (increasedDistance * 0.05);
        double secondDistance = reducedDistance * thirdTimeH;

        double result = distance + firstDistance + secondDistance;
        System.out.printf("%.2f", result);
    }
}