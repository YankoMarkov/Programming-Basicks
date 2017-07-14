
import java.util.Scanner;

public class DateAfter5Days {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = Integer.valueOf(scan.nextLine());
        int month = Integer.valueOf(scan.nextLine());

        int newDay = 0;
        int newMonth = 0;
        newDay = day + 5;

        switch (month) {
            case 2:
                if (newDay > 28) {
                    newDay = (day + 5) - 28;
                    newMonth = month + 1;
                } else {
                    newMonth = month;
                }
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (newDay > 30) {
                    newDay = (day + 5) - 30;
                    newMonth = month + 1;
                } else {
                    newMonth = month;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (newDay > 31) {
                    newDay = (day + 5) - 31;
                    newMonth = month + 1;
                } else {
                    newMonth = month;
                }
                break;
            case 12:
                if (newDay > 31) {
                    newDay = (day + 5) - 31;
                    newMonth = 1;
                } else {
                    newMonth = month;
                }
                break;
            default:
                break;
        }
        System.out.printf("%d.%02d", newDay, newMonth);
    }
}
