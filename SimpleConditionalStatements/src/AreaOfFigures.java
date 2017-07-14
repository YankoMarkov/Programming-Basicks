import java.util.Scanner;

public class AreaOfFigures {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        double result = 0;

        if (figure.equals("square")) {
            double a = Double.valueOf(scan.nextLine());
            result = a * a;
            System.out.printf("%.3f", result);
        } else if (figure.equals("rectangle")) {
            double a = Double.valueOf(scan.nextLine());
            double b = Double.valueOf(scan.nextLine());
            result = a * b;
            System.out.printf("%.3f", result);
        } else if (figure.equals("circle")) {
            double r = Double.valueOf(scan.nextLine());
            result = Math.PI * r * r;
            System.out.printf("%.3f", result);
        } else if (figure.equals("triangle")) {
            double b = Double.valueOf(scan.nextLine());
            double h = Double.valueOf(scan.nextLine());
            result = (b * h) / 2;
            System.out.printf("%.3f", result);
        }
    }
}
