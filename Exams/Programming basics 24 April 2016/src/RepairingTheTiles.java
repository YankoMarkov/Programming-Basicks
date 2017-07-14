
import java.text.DecimalFormat;
import java.util.Scanner;

public class RepairingTheTiles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double w = input.nextDouble();
        double l = input.nextDouble();
        int m = input.nextInt();
        int o = input.nextInt();

        int area = (n * n) - (m * o);
        double tileArea = w * l;
        double tilesCount = (double) area / tileArea;
        double time = tilesCount * 0.2;
        double a1 = tilesCount * 10 % 10;
        int b1 = (int) a1;
        double a2 = a1 * 10 % 10;
        int b2 = (int) a2;
        double c1 = time * 10 % 10;
        int d1 = (int) c1;
        double c2 = c1 * 10 % 10;
        int d2 = (int) c2;

        DecimalFormat df1 = new DecimalFormat("0.###########");
        DecimalFormat df2 = new DecimalFormat("0.############");

        if (b1 == 9 && b2 == 9 && d1 == 9 && d2 == 9) {
            System.out.printf("%.0f\n%.0f", tilesCount, time);
        } else if (b1 == 9 && b2 == 9){
            System.out.printf("%.0f\n%s", tilesCount, df2.format(time));
        } else if (d1 == 9 && d2 == 9) {
            System.out.printf("%s\n%.0f", df1.format(tilesCount), time);
        } else {
            System.out.printf("%s\n%s", df1.format(tilesCount), df2.format(time));
        }
    }
}
