import java.text.DecimalFormat;
import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = Double.valueOf(scan.nextLine());
        double fahrenheit = celsius * 1.8 + 32;
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(fahrenheit));
    }
}
