
import java.text.DecimalFormat;
import java.util.Scanner;

public class PoolPipes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int poolLiters = input.nextInt();
        int firstPipeLiters = input.nextInt();
        int secondPipeLiters = input.nextInt();
        float hours = input.nextFloat();

        float firsPipe = hours * firstPipeLiters;
        float secondPipe = hours * secondPipeLiters;
        float sumLiters = firsPipe + secondPipe;

        if (sumLiters <= poolLiters) {
            float sum = (sumLiters * 100) / poolLiters;
            int sum1 = (int) sum;
            float pipe1 = (firsPipe * 100) / sumLiters;
            int p1 = (int) pipe1;
            float pipe2 = (secondPipe * 100) / sumLiters;
            int p2 = (int) pipe2;
            System.out.println("The pool is " + sum1 + "% full. Pipe 1: " + p1 + "%. Pipe 2: " + p2 + "%.");
        }
        if (sumLiters > poolLiters) {
            float sum = sumLiters - poolLiters;
            DecimalFormat d = new DecimalFormat("0.##");
            System.out.printf("For %s hours the pool overflows with %s liters.", d.format(hours), d.format(sum));
        }
    }
}
