
import java.util.Scanner;

public class Fishland {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceSkumria = Double.valueOf(scan.nextLine());
        double priceCaca = Double.valueOf(scan.nextLine());
        double kiloPalamud = Double.valueOf(scan.nextLine());
        double kiloSafrid = Double.valueOf(scan.nextLine());
        int kiloMidi = Integer.valueOf(scan.nextLine());

        double pricePalamud = (0.6 * priceSkumria) + priceSkumria;
        double priceSafrid = (0.8 * priceCaca) + priceCaca;
        double priceMidi = 7.5;

        double palamud = kiloPalamud * pricePalamud;
        double safrid = kiloSafrid * priceSafrid;
        double midi = kiloMidi * priceMidi;
        double total = palamud + safrid + midi;
        System.out.printf("%.2f", total);
    }
}
