
import java.util.Scanner;

public class StudyHall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double w = input.nextDouble();
        double h = input.nextDouble();
        double length = w * 100;
        double width =(h * 100) - 100;
        int desks = (int) width / 70;
        int rows = (int) length / 120;
        int result = (desks * rows) - 3;
        System.out.println(result);
    }
}
