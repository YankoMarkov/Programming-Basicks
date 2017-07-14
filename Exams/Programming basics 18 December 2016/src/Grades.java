
import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int students = Integer.valueOf(scan.nextLine());
        double low = 0;
        double middle = 0;
        double good = 0;
        double excellent = 0;
        double averageGrade = 0;

        for (int i = 0; i < students; i++) {
            double grade = Double.valueOf(scan.nextLine());
            if (grade >= 2.0 && grade <= 2.99) {
                low++;
                averageGrade += grade;
            } else if (grade >= 3.0 && grade <= 3.99) {
                middle++;
                averageGrade += grade;
            } else if (grade >= 4.0 && grade <= 4.99) {
                good++;
                averageGrade += grade;
            } else if (grade >= 5.0) {
                excellent++;
                averageGrade += grade;
            }
        }
        double average = averageGrade / students;
        System.out.printf("Top students: %.2f%%\n", excellent * (100.0 / students));
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", good * (100.0 / students));
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", middle * (100.0 / students));
        System.out.printf("Fail: %.2f%%\n", low * (100.0 / students));
        System.out.printf("Average: %.2f\n", average);
    }
}
