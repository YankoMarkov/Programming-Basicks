
import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vegetablePrice = input.nextDouble();
        double fruitPrice = input.nextDouble();
        int vegetableKilogram = input.nextInt();
        int fruitKilogram = input.nextInt();

        double sumVegetablePrice = vegetablePrice * vegetableKilogram;
        double sumFruitPrice = fruitPrice * fruitKilogram;
        double sumPrice = (sumFruitPrice + sumVegetablePrice) / 1.94;
        System.out.printf("%.2f", sumPrice);
    }
}
