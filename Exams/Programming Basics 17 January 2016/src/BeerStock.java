import java.util.Scanner;

public class BeerStock {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long amountReservedBeers = Long.valueOf(scan.nextLine());
        String beersPacks = null;
        long beersCount = 0;

        while (!(beersPacks = scan.nextLine()).equals("Exam Over")) {
            String[] beerPack = beersPacks.split("\\s+");
            long beersNumbers = Long.valueOf(beerPack[0]);
            String beersLable = beerPack[1];

            switch (beersLable) {
                case "beers":
                    beersCount += beersNumbers;
                    break;
                case "sixpacks":
                    beersCount += (beersNumbers * 6);
                    break;
                case "cases":
                    beersCount += (beersNumbers * 24);
                    break;
                default:
                    break;
            }
        }

        long beersCountTotal = 0;
        if (beersCount >= 100) {
            beersCountTotal = beersCount - (beersCount / 100);
        } else {
            beersCountTotal = beersCount;
        }

        long cases = 0;
        long sixpacks = 0;
        long beers = 0;
        long beerCount = 0;

        if (beersCountTotal >= amountReservedBeers) {
            beerCount = beersCountTotal - amountReservedBeers;
            if (beerCount >= 24) {
                beers = beerCount % 24;
                cases = beerCount / 24;
                if (beers >= 6) {
                    sixpacks = beers / 6;
                    beers = beers % 6;
                }
            } else if (beerCount < 24 && beerCount > 6) {
                sixpacks = beerCount / 6;
                beers = beerCount % 6;
            } else {
                beers = beerCount;
            }
            System.out.printf("Cheers! Beer left: %d cases, %d sixpacks and %d beers.", cases, sixpacks, beers);
        } else {
            beerCount = amountReservedBeers - beersCountTotal;
            if (beerCount >= 24) {
                beers = beerCount % 24;
                cases = beerCount / 24;
                if (beers >= 6) {
                    sixpacks = beers / 6;
                    beers = beers % 6;
                }
            } else if (beerCount < 24 && beerCount > 6) {
                sixpacks = beerCount / 6;
                beers = beerCount % 6;
            } else {
                beers = beerCount;
            }
            System.out.printf("Not enough beer. Beer needed: %d cases, %d sixpacks and %d beers.", cases, sixpacks, beers);
        }
    }
}

