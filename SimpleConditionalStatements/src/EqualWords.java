import java.util.Scanner;

public class EqualWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word1 = scan.nextLine().toLowerCase();
        String word2 = scan.nextLine().toLowerCase();

        if (word1.equals(word2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
