import java.text.DecimalFormat;
import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.valueOf(scan.nextLine());
        double y1 = Double.valueOf(scan.nextLine());
        double x2 = Double.valueOf(scan.nextLine());
        double y2 = Double.valueOf(scan.nextLine());
        double area = Math.abs((x1 - x2) * (y1 - y2));
        double perimeter = (Math.abs(x1 - x2) + Math.abs(y1 - y2)) * 2;
        if (area % 10 == 0 && perimeter % 10 == 0) {
            System.out.printf("%.0f\n%.0f", area, perimeter);
        } else {
            DecimalFormat decimalFormat = new DecimalFormat("#.###");
            System.out.println(decimalFormat.format(area));
            System.out.println(decimalFormat.format(perimeter));
        }
    }
}
