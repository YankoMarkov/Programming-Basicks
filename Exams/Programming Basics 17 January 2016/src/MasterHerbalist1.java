import java.util.Scanner;

public class MasterHerbalist1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dailyExpenses = Integer.valueOf(scan.nextLine());
        String inputs = null;
        double seasonMoney = 0;
        int count = 0;

        while (!(inputs = scan.nextLine()).equals("Season Over")) {
            count++;
            String[] input = inputs.split("\\s+");
            int hours = Integer.valueOf(input[0]);
            String path = input[1];
            int herbsPrice = Integer.valueOf(input[2]);
            int herbsCount = 0;

            for (int i = 0; i < hours; i++) {
                if (path.charAt(i % path.length()) == 'H') {
                    herbsCount++;
                }
            }

            double dailyMoney = herbsCount * herbsPrice;
            seasonMoney += dailyMoney;
        }
        double totalMoney = seasonMoney / count;
        double totalExpenses = dailyExpenses * count;
        if (totalMoney >= dailyExpenses) {
            double money = totalMoney - dailyExpenses;
            System.out.printf("Times are good. Extra money per day: %.2f.", money);
        } else {
            double money = totalExpenses - seasonMoney;
            System.out.printf("We are in the red. Money needed: %.0f.", money);
        }

    }
}
