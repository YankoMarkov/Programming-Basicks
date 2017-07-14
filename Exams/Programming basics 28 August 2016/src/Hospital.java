
import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int doctor = 7;
        int days = input.nextInt();
        int sumTreated = 0;
        int sumUntreated = 0;
        int treated = 0;
        int untreated = 0;

        for (int i = 0; i < days; i++) {
            int patient = input.nextInt();
            if (sumTreated < sumUntreated && (i + 1) % 3 == 0) {
                doctor += 1;
            }
            if (doctor == patient) {
                treated = doctor;
                untreated = 0;
            }
            if (patient > doctor) {
                treated = doctor;
                untreated = patient - doctor;
            }
            if (patient < doctor) {
                treated = patient;
                untreated = 0;
            }
            sumTreated += treated;
            treated = 0;
            sumUntreated += untreated;
            untreated = 0;
        }
        System.out.printf("Treated patients: %d.\nUntreated patients: %d.", sumTreated, sumUntreated);
    }
}
