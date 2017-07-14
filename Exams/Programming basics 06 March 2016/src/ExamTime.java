
import java.util.Scanner;

public class ExamTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hh = input.nextInt();
        int mm = input.nextInt();
        int hhStudent = input.nextInt();
        int mmStudent = input.nextInt();

        if (hhStudent > hh) {
            if (mmStudent >= mm) {
                int h = hhStudent - hh;
                int m = mmStudent - mm;
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", h, m);
            }
            if (mmStudent < mm) {
                if (hhStudent - hh > 1) {
                    int m = (mmStudent + 60) - mm;
                    int h = hhStudent - (hh + 1);
                    System.out.println("Late");
                    System.out.printf("%d:%02d hours after the start", h, m);
                } else {
                    int m = (mmStudent + 60) - mm;
                    System.out.println("Late");
                    System.out.printf(m + " minutes after the start");
                }
            }
        }

        if (hhStudent == hh) {
            if (mmStudent > mm) {
                int m = mmStudent - mm;
                System.out.println("Late");
                System.out.println(m + " minutes after the start");
            }
            if (mmStudent < mm) {
                if (mm - mmStudent <= 30) {
                    int m = mm - mmStudent;
                    System.out.println("On time");
                    System.out.println(m + " minutes before the start");
                }
                if (mm - mmStudent > 30) {
                    int m = mm - mmStudent;
                    System.out.println("Early");
                    System.out.println(m + " minutes before the start");
                }
            }
            if (mmStudent == mm) {
                System.out.println("On time");
            }
        }

        if (hhStudent < hh) {
            if (mmStudent <= mm) {
                int h = hh - hhStudent;
                int m = mm - mmStudent;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", h, m);
            }
            if (mmStudent > mm) {
                if ((mm + 60) - mmStudent <= 30) {
                    int m = (mm + 60) - mmStudent;
                    System.out.println("On time");
                    System.out.println(m + " minutes before the start");
                }
                if ((mm + 60) - mmStudent > 30) {
                    if (hh - hhStudent > 1) {
                        int m = (mm + 60) - mmStudent;
                        int h = hh - (hhStudent + 1);
                        System.out.println("Early");
                        System.out.printf("%d:%02d hours before the start", h, m);
                    } else {
                        int m = (mm + 60) - mmStudent;
                        System.out.println("Early");
                        System.out.println(m + " minutes before the start");
                    }
                }
            }
        }
    }
}
