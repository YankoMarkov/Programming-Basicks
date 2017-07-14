import java.util.Scanner;

public class TradeCommissions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        double s = Double.valueOf(scan.nextLine());
        double percent = 0;

        switch (town) {
            case "Sofia":
                if (s >= 0 && s <= 500) {
                    percent = 5;
                } else if (s > 500 && s <= 1000) {
                    percent = 7;
                } else if (s > 1000 && s <= 10000) {
                    percent = 8;
                } else if (s > 10000) {
                    percent = 12;
                }
                break;
            case "Varna":
                if (s >= 0 && s <= 500) {
                    percent = 4.5;
                } else if (s > 500 && s <= 1000) {
                    percent = 7.5;
                } else if (s > 1000 && s <= 10000) {
                    percent = 10;
                } else if (s > 10000) {
                    percent = 13;
                }
                break;
            case "Plovdiv":
                if (s >= 0 && s <= 500) {
                    percent = 5.5;
                } else if (s > 500 && s <= 1000) {
                    percent = 8;
                } else if (s > 1000 && s <= 10000) {
                    percent = 12;
                } else if (s > 10000) {
                    percent = 14.5;
                }
                break;
        }
        if (s < 0 || percent == 0) {
            System.out.println("error");
        } else {
            double result = s * (percent / 100);
            System.out.printf("%.2f", result);
        }
    }
}
