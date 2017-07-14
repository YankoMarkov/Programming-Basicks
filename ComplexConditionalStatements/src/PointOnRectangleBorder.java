import java.util.Scanner;

public class PointOnRectangleBorder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.valueOf(scan.nextLine());
        double y1 = Double.valueOf(scan.nextLine());
        double x2 = Double.valueOf(scan.nextLine());
        double y2 = Double.valueOf(scan.nextLine());
        double x = Double.valueOf(scan.nextLine());
        double y = Double.valueOf(scan.nextLine());

        boolean isYOnBorder = (x >= x1 && x <= x2) && (y == y1 || y == y2);
        boolean isXOnBorder = (y >= y1 && y <= y2) && (x == x1 || x == x2);
        if (isXOnBorder || isYOnBorder) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
