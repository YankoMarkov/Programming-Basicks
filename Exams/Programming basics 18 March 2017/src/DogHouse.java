import java.util.Scanner;

public class DogHouse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double wideSideA = Double.valueOf(scan.nextLine());
        double highHouse = Double.valueOf(scan.nextLine());

        double twoSideArea = (wideSideA * (wideSideA / 2.0)) * 2.0;
        double squareArea = (wideSideA / 2.0) * (wideSideA / 2.0);
        double highTriangle = highHouse - (wideSideA / 2.0);
        double triangleArea = ((wideSideA / 2.0) * highTriangle) / 2.0;
        double backSideArea = triangleArea + squareArea;
        double doorArea = (wideSideA / 5.0) * (wideSideA / 5.0);
        double frontSideArea = backSideArea - doorArea;

        double sideArea = twoSideArea + backSideArea + frontSideArea;
        double roofArea = twoSideArea;

        double paintForSide = sideArea / 3.0;
        double paintForRoof = roofArea / 5.0;

        System.out.printf("%.2f%n", paintForSide);
        System.out.printf("%.2f%n", paintForRoof);
    }
}
