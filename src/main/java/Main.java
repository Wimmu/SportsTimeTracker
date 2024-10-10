import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SportsActivityTracker tracker = new SportsActivityTracker();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Log Activity");
            System.out.println("2. View Activities");
            System.out.println("3. Calculate Total Time");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter sport: ");
                    String sport = scanner.nextLine();
                    System.out.print("Enter duration in minutes: ");
                    int duration = scanner.nextInt();
                    tracker.logActivity(sport, duration);
                    break;
                case 2:
                    tracker.viewActivities();
                    break;
                case 3:
                    tracker.calculateTotalTime();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}