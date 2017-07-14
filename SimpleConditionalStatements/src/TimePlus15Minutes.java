import java.util.Scanner;

public class TimePlus15Minutes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.valueOf(scan.nextLine());
        int minute = Integer.valueOf(scan.nextLine());

        int hours = 0;
        int minutes = minute + 15;

        if (minutes > 59) {
            if (hour < 23) {
                hours = hour + 1;
                minutes -= 60;
                System.out.printf("%d:%02d", hours, minutes);
            } else {
                hours = (hour + 1) - 24;
                minutes -= 60;
                System.out.printf("%d:%02d", hours, minutes);
            }
        } else {
            if (hour < 23) {
                System.out.printf("%d:%02d", hour, minutes);
            } else {
                System.out.printf("%d:%02d", hour, minutes);
            }
        }
    }
}
