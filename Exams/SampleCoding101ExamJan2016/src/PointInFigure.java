
import java.util.Scanner;

public class PointInFigure {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.valueOf(scan.nextLine());
        int y = Integer.valueOf(scan.nextLine());

        boolean fig1 = (y >= -3 && y <= 1 && x >= 2 && x <= 12);
        boolean fig2 = (x >= 4 && x <= 10 && y >= -5 && y <= 3);

        if (fig1 || fig2) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
    }
}
