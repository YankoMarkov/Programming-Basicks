import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        int r = Integer.valueOf(scan.nextLine());
        int c = Integer.valueOf(scan.nextLine());
        double premiere = 12;
        double normal = 7.5;
        double discount = 5;
        double result = 0;

        switch (type) {
            case "Premiere":
                result = premiere * r * c;
                break;
            case "Normal":
                result = normal * r * c;
                break;
            case "Discount":
                result = discount * r * c;
                break;
        }
        System.out.printf("%.2f leva", result);
    }
}
