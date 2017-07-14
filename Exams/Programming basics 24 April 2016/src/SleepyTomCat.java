
import java.util.Scanner;

public class SleepyTomCat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int workDay = 365 - n;
        int playTime = workDay * 63 + n * 127;

        if (30000 > playTime) {
            int relax = 30000 - playTime;
            int hours = relax / 60;
            int minutes = relax % 60;
            System.out.println("Tom sleeps well");
            System.out.println(hours + " hours and " + minutes + " minutes less for play");
        }
        if (playTime > 30000) {
            int relax = playTime - 30000;
            int hours = relax / 60;
            int minutes = relax % 60;
            System.out.println("Tom will run away");
            System.out.println(hours + " hours and " + minutes + " minutes more for play");
        }
    }
}
