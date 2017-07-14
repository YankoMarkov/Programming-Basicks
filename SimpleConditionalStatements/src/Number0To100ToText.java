import java.util.Scanner;

public class Number0To100ToText {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());
        String[] smallNumbers = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
        String[] decimalNumbers = new String[]{"twen", "thir", "four", "fif", "six", "seven", "eigh", "nine"};
        String name = null;

        if (number < 0 || number > 100) {
            name = "invalid number";
        } else if (number < 13) {
            name = smallNumbers[number];
        } else if (number > 12 && number < 20) {
            name = decimalNumbers[number % 10 - 2] + "teen";
        } else if (number > 19 && number < 100) {
            if (number / 10 == 4) {
                name = "forty";
            } else {
                name = decimalNumbers[number / 10 - 2] + "ty";
            }
            if (number % 10 != 0) {
                name += " " + smallNumbers[number % 10];
            }
        } else if (number == 100) {
            name = "one hundred";
        }
        System.out.println(name);
    }
}