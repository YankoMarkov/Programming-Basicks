import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.valueOf(scan.nextLine());
        int b = Integer.valueOf(scan.nextLine());

        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
