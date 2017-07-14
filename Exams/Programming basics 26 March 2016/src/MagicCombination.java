
import java.util.Scanner;

public class MagicCombination {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i1 = 0; i1 <= 9; i1++) {
            for (int i2 = 0; i2 <= 9 ; i2++) {
                for (int i3 = 0; i3 <= 9; i3++) {
                    for (int i4 = 0; i4 <= 9; i4++) {
                        for (int i5 = 0; i5 <= 9; i5++) {
                            for (int i6 = 0; i6 <= 9; i6++) {
                                if (i1 * i2 * i3 * i4 * i5 * i6 == n) {
                                    System.out.printf("%d%d%d%d%d%d ", i1, i2, i3, i4, i5, i6);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
