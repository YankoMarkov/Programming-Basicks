import java.util.Scanner;

public class WorkHours {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hoursNeeded = Integer.valueOf(scan.nextLine());
        int workerCount = Integer.valueOf(scan.nextLine());
        int workingDais = Integer.valueOf(scan.nextLine());

        int hoursToFinishJobs = workerCount * workingDais * 8;

        if (hoursToFinishJobs >= hoursNeeded) {
            int hoursLeft = hoursToFinishJobs - hoursNeeded;
            System.out.printf("%d hours left%n", hoursLeft);
        } else {
            int hoursNeed = hoursNeeded - hoursToFinishJobs;
            int penalties = hoursNeed * workingDais;
            System.out.printf("%d overtime%nPenalties: %d", hoursNeed, penalties);

        }
    }
}
