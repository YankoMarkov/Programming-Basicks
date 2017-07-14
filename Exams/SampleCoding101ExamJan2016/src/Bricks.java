
import java.util.Scanner;

public class Bricks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bricks = Integer.valueOf(scan.nextLine());
        int workers = Integer.valueOf(scan.nextLine());
        int wheelbarrow = Integer.valueOf(scan.nextLine());

        int bricksMove = workers * wheelbarrow;
        int bricksLeft = 0;
        int count = 0;
        while (bricksLeft <= bricks) {
            count++;
            bricksLeft += bricksMove;

        }
        System.out.println(count);
    }
}
