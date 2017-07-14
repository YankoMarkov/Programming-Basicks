import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int digit = Integer.valueOf(scan.nextLine());

        if (digit % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
