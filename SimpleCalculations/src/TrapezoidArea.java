import java.util.Scanner;

public class TrapezoidArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double b1 = Double.valueOf(scan.nextLine());
        double b2 = Double.valueOf(scan.nextLine());
        double h = Double.valueOf(scan.nextLine());
        double area = (b1 + b2) * h / 2;
        System.out.println(area);
    }
}
