import java.util.Scanner;

public class PersonalTitles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double age = Double.valueOf(scan.nextLine());
        String gender = scan.nextLine();

        if (age < 16) {
            if (gender.equals("m")) {
                System.out.println("Master");
            } else if (gender.equals("f")) {
                System.out.println("Miss");
            }
        } else {
            if (gender.equals("m")) {
                System.out.println("Mr.");
            } else if (gender.equals("f")) {
                System.out.println("Ms.");
            }
        }
    }
}