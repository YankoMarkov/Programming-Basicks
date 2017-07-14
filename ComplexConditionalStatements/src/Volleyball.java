import java.util.Scanner;

public class Volleyball {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String year = scan.nextLine();
        int p = Integer.valueOf(scan.nextLine());
        int h = Integer.valueOf(scan.nextLine());
        int weekend = 48;
        double playTime = 0;

        double weekendInSofia = weekend - h;
        double playInSofia = weekendInSofia * 3.0 / 4;
        double playInHoliday = p * 2.0 / 3;
        double playInYear = playInSofia + h + playInHoliday;

        if (year.equals("leap")) {
            playInYear = (0.15 * playInYear) + playInYear;
            playTime = Math.floor(playInYear);
        } else if (year.equals("normal")) {
            playTime = Math.floor(playInYear);
        }
        System.out.printf("%.0f", playTime);
    }
}
