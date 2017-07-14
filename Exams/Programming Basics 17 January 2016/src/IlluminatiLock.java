import java.util.Scanner;

public class IlluminatiLock {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());

        int a = n;
        int b = n;
        int c = ((n + 1) / 2) - 2;
        int d = n - 4;
        int e = n - 2;
        System.out.print(figDot(a) + figDies(b) + figDot(a));
        System.out.println();
        a = n - 2;
        b = 3;
        System.out.print(figDot(a) + figDies(b) + figDot(a) + figDies(b) + figDot(a));
        System.out.println();
        a = 2;
        for (int i = 0; i < c; i++) {
            System.out.print(figDot(d) + "##" + figDot(a) + "#");
            System.out.print(figDot(e));
            System.out.print("#" + figDot(a) + "##" + figDot(d));
            System.out.println();
            d -= 2;
            a += 2;
        }
        a -= 2;
        d += 2;
        for (int i = 0; i < c; i++) {
            System.out.print(figDot(d) + "##" + figDot(a) + "#");
            System.out.print(figDot(e));
            System.out.print("#" + figDot(a) + "##" + figDot(d));
            System.out.println();
            d += 2;
            a -= 2;
        }
        a = n - 2;
        b = 3;
        System.out.print(figDot(a) + figDies(b) + figDot(a) + figDies(b) + figDot(a));
        System.out.println();
        a = n;
        b = n;
        System.out.print(figDot(a) + figDies(b) + figDot(a));
    }

    private static String figDot(int nim) {
        String result = "";
        for (int j = 0; j < nim; j++) {
            result += ".";
        }
        return result;
    }

    private static String figDies(int num) {
        String result = "";
        for (int j = 0; j < num; j++) {
            result += "#";
        }
        return result;
    }
}
