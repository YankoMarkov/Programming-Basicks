import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = Integer.valueOf(scan.nextLine());
        int area = a * a;
        System.out.println("Square = " + area);
    }
}
