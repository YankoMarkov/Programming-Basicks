
import java.util.Scanner;

public class Sums3Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.valueOf(scan.nextLine());
        int num2 = Integer.valueOf(scan.nextLine());
        int num3 = Integer.valueOf(scan.nextLine());
        int a = 0;
        int b = 0;
        int c = 0;

        if (num1 > num2 && num1 > num3) {
            a = num1;
            if (num2 > num3) {
                b = num2;
                c = num3;
            } else {
                b = num3;
                c = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            a = num2;
            if (num1 > num3) {
                b = num1;
                c = num3;
            } else {
                b = num3;
                c = num1;
            }
        } else if (num3 > num1 && num3 > num2) {
            a= num3;
            if (num1 > num2) {
                b = num1;
                c = num2;
            } else {
                b = num2;
                c = num1;
            }
        }

        boolean res1 = (a + b == c);
        boolean res2 = (a + c == b);
        boolean res3 = (b + c == a);

        if (res1) {
            System.out.printf("%d + %d = %d", b, a, (a + b));
        } else if (res2) {
            System.out.printf("%d + %d = %d", c, a, (a + c));
        } else if (res3) {
            System.out.printf("%d + %d = %d", c, b, (b + c));
        } else {
            System.out.println("No");
        }
    }
}
