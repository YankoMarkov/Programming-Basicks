import java.util.Scanner;

public class MasterHerbalist {

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
            int index = 0;
            StringBuilder paths = new StringBuilder(path);

            if (path.length() < hours) {
                hours = hours - path.length();
                while (hours != 0) {
                    paths = paths.append(path.charAt(index));
                    hours--;
                    index++;
                    if (index >= path.length()) {
                        index = 0;
                    }
                }
            } else {
                paths.delete(hours, paths.length());
            }

            String result = paths.toString();
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == 'H') {
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

