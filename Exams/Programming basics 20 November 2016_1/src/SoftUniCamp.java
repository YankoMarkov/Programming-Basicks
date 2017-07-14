
import java.util.Scanner;

public class SoftUniCamp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groups = Integer.valueOf(scan.nextLine());
        int[] group = new int[groups];
        int count = 0;
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        int group5 = 0;

        for (int i = 0; i < group.length; i++) {
            group[i] = Integer.valueOf(scan.nextLine());
            count += group[i];
        }
        for (int i = 0; i < group.length; i++) {
            if (group[i] <= 5) {
                group1 += group[i];
            } else if (group[i] > 5 && group[i] <= 12) {
                group2 += group[i];
            } else if (group[i] > 12 && group[i] <= 25) {
                group3 += group[i];
            } else if (group[i] > 25 && group[i] <= 40) {
                group4 += group[i];
            } else {
                group5 += group[i];
            }
        }
        System.out.printf("%.2f%%\n", (double)group1 / count * 100);
        System.out.printf("%.2f%%\n", (double)group2 / count * 100);
        System.out.printf("%.2f%%\n", (double)group3 / count * 100);
        System.out.printf("%.2f%%\n", (double)group4 / count * 100);
        System.out.printf("%.2f%%\n", (double)group5 / count * 100);

    }
}
