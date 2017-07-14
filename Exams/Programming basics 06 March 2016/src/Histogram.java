
import java.util.Arrays;
import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        Arrays.sort(array);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 200) {
                count1++;
            }
            if (array[i] >= 200 && array[i] < 400) {
                count2++;
            }
            if (array[i] >= 400 && array[i] < 600) {
                count3++;
            }
            if (array[i] >= 600 && array[i] < 800) {
                count4++;
            }
            if (array[i] >= 800) {
                count5++;
            }
        }
        double p1 = (double) count1 / n * 100;
        double p2 = (double) count2 / n * 100;
        double p3 = (double) count3 / n * 100;
        double p4 = (double) count4 / n * 100;
        double p5 = (double) count5 / n * 100;
        System.out.printf("%.2f\n%.2f\n%.2f\n%.2f\n%.2f", p1, p2, p3, p4, p5);
    }
}
