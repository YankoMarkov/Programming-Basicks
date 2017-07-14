import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.valueOf(scan.nextLine());
        double result = 0;
        double point = 0;

        if (number <= 100) {
            point = 5;
            result = number + point;
            if (number % 2 == 0) {
                result += 1;
                System.out.println(point + 1);
                System.out.printf("%.0f", result);
            } else if (number % 10 == 5) {
                result += 2;
                System.out.println(point + 2);
                System.out.printf("%.0f", result);
            } else {
                System.out.println(point);
                System.out.printf("%.0f", result);
            }
        } else if (number > 100 && number <= 1000) {
            point = number * 0.2;
            result = number + point;
            if (number % 2 == 0) {
                result += 1;
                System.out.println(point + 1);
                System.out.printf("%.1f", result);
            } else if (number % 10 == 5) {
                result += 2;
                System.out.println(point + 2);
                System.out.printf("%.1f", result);
            } else {
                System.out.println(point);
                System.out.printf("%.1f", result);
            }
        } else if (number > 1000) {
            point = number * 0.1;
            result = number + point;
            if (number % 2 == 0) {
                result += 1;
                System.out.println(point + 1);
                System.out.printf("%.1f", result);
            } else if (number % 10 == 5) {
                result += 2;
                System.out.println(point + 2);
                System.out.printf("%.1f", result);
            } else {
                System.out.println(point);
                System.out.printf("%.1f", result);
            }
        }
    }
}
