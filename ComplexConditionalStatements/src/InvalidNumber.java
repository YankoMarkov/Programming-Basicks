import java.util.Scanner;

public class InvalidNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());

        boolean num = number >= 100 && number <= 200;
        if (num || number == 0) {

        } else {
            System.out.println("invalid");
        }
    }
}
