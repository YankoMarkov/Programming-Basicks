
import java.util.Scanner;

public class PointOnSegment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = Integer.valueOf(scan.nextLine());
        int x2 = Integer.valueOf(scan.nextLine());
        int point = Integer.valueOf(scan.nextLine());

        int first = 0;
        int second = 0;

        if (x1 < x2) {
            first = x1;
            second = x2;
        } else {
            first = x2;
            second = x1;
        }
        int a = Math.abs(point - first);
        int b = Math.abs(point - second);

        if (point < first || point > second) {
            if (a <= b) {
                System.out.printf("out\n%d", a);
            } else {
                System.out.printf("out\n%d", b);
            }
        } else {
            if (a <= b) {
                System.out.printf("in\n%d", a);
            } else {
                System.out.printf("in\n%d", b);
            }
        }
    }
}
