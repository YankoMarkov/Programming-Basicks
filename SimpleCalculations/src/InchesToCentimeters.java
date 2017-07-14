import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("inches = ");
        double inch = Double.valueOf(scan.nextLine());
        double result = inch * 2.54;
        System.out.println("centimeters = " + result);
    }
}
