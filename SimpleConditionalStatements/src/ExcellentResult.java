import java.util.Scanner;

public class ExcellentResult {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.valueOf(scan.nextLine());

        if (grade >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}