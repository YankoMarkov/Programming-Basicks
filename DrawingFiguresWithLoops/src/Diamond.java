import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        String[] bottom = new String[(n + 1) / 2];
        int index = 0;
        int stars = 0;
        int line = (n - 2) / 2;
        int line1 = (n - 1) / 2;
        for (int i = 0; i < (n + 1) / 2; i++) {
            if (n % 2 == 0) {
                System.out.print(top(stars, line));
                bottom[i] = top(stars, line);
            } else {
                System.out.print(top1(stars, line1, index));
                bottom[i] = top1(stars, line1, index);
                if (index < 1) {
                    stars--;
                }
            }
            index++;
            line--;
            stars += 2;
            line1--;
            System.out.println();
        }
        for (int i = bottom.length - 2; i >= 0; i--) {
            System.out.println(bottom[i]);
        }
    }

    private static String top(int stars, int line) {
        String result = "";
        for (int j = 0; j < line; j++) {
            result += "-";
        }
        result += "*";
        for (int j = 0; j < stars; j++) {
            result += "-";
        }
        result += "*";
        for (int j = 0; j < line; j++) {
            result += "-";
        }
        return result;
    }

    private static String top1(int stars, int line, int index) {
        String result = "";
        for (int j = 0; j < line; j++) {
            result += "-";
        }
        result += "*";
        for (int j = 0; j < stars; j++) {
            result += "-";
        }
        if (index > 0) {
            result += "*";
        }
        for (int j = 0; j < line; j++) {
            result += "-";
        }
        return result;
    }
}
