import java.util.Scanner;

public class ThreeEqualNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.valueOf(scan.nextLine());
        int num2 = Integer.valueOf(scan.nextLine());
        int num3 = Integer.valueOf(scan.nextLine());

        if (num1 == num2 && num1 == num3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
