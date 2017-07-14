
import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = Integer.valueOf(scan.nextLine());
        int y1 = Integer.valueOf(scan.nextLine());
        int x2 = Integer.valueOf(scan.nextLine());
        int y2 = Integer.valueOf(scan.nextLine());
        int x3 = Integer.valueOf(scan.nextLine());
        int y3 = Integer.valueOf(scan.nextLine());

        int a = Math.abs(x3 - x2);
        int h = Math.abs(y3 - y1);

        double s = a * h / 2.0;
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(s));
    }
}
