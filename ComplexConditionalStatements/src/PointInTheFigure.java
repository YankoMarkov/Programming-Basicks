import java.util.Scanner;

public class PointInTheFigure {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.valueOf(scan.nextLine());
        int x = Integer.valueOf(scan.nextLine());
        int y = Integer.valueOf(scan.nextLine());

        boolean isXFig1Inside = x >= 0 && x <= 3 * h;
        boolean isYFig1Inside = y >= 0 && y <= h;
        boolean isXFig2Inside = x >= h && x <= 2 * h;
        boolean isYFig2Inside = y >= h && y <= 4 * h;

        boolean isYOnBorder1 = x >= 0 && x <= 3 * h && y == 0;
        boolean isYOnBorder2 = x >= 0 && x <= h && y == h;
        boolean isYOnBorder3 = x >= 2 * h && x <= 3 * h && y == h;
        boolean isYOnBorder4 = x >= h && x <= 2 * h && y == 4 * h;
        boolean isXOnBorder1 = y >= 0 && y <= h && x == 0;
        boolean isXOnBorder2 = y >= h && y <= 4 * h && x == h;
        boolean isXOnBorder3 = y >= h && y <= 4 * h && x == 2 * h;
        boolean isXOnBorder4 = y >= 0 && y <= h && x == 3 * h;

        if (isYOnBorder1 || isYOnBorder2 || isYOnBorder3 || isYOnBorder4 || isXOnBorder1 || isXOnBorder2 || isXOnBorder3 || isXOnBorder4) {
            System.out.println("border");
        } else if ((isXFig1Inside && isYFig1Inside) || (isXFig2Inside && isYFig2Inside)) {
            System.out.println("inside");
        } else {
            System.out.println("outside");
        }
    }
}
