
import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        char simbol = input.next().charAt(0);

        switch (simbol) {
            case '+':
                int sum = n1 + n2;
                if (sum % 2 == 0) {
                    System.out.println(n1 + " + " + n2 + " = " + sum + " - " + "even");
                } else {
                    System.out.println(n1 + " + " + n2 + " = " + sum + " - " + "odd");
                }
                break;
            case '-':
                int sum1 = n1 - n2;
                if (sum1 % 2 == 0) {
                    System.out.println(n1 + " - " + n2 + " = " + sum1 + " - " + "even");
                } else {
                    System.out.println(n1 + " - " + n2 + " = " + sum1 + " - " + "odd");
                }
                break;
            case '*':
                int sum2 = n1 * n2;
                if (sum2 % 2 == 0) {
                    System.out.println(n1 + " * " + n2 + " = " + sum2 + " - " + "even");
                } else {
                    System.out.println(n1 + " * " + n2 + " = " + sum2 + " - " + "odd");
                }
                break;
            case '/':
                if (n1 == 0 || n2 == 0) {
                    System.out.println("Cannot divide " + n1 + " by zero");
                } else {
                    double sum3 = (double) n1 / (double) n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, sum3);
                }
                break;
            case '%':
                if (n1 == 0 || n2 == 0) {
                    System.out.println("Cannot divide " + n1 + " by zero");
                } else {
                    double sum4 = (double) n1 % (double) n2;
                    System.out.printf("%d %% %d = %.0f", n1, n2, sum4);
                }
                break;
        }
    }
}
