
import java.util.Scanner;

public class GenerateRectangles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        int m = Integer.valueOf(scan.nextLine());

        int area = 0;
        int count = 0;
        for (int x1 = -n; x1 <= n; x1++) {
            for (int y1 = -n; y1 <= n; y1++) {
                for (int x2 = n; x2 > x1; x2--) {
                    for (int y2 = n; y2 > y1; y2--) {
                        area = (x2 - x1) * (y2 - y1);
                        if (area >= m) {
                            System.out.printf("(%d, %d) (%d, %d) -> %d\n", x1, y1, x2, y2, area);
                            count++;
                        }
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No");
        }
    }
}
