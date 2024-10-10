import java.util.ArrayList;
import java.util.List;

public class SportsActivityTracker {
    private List<Activity> activities;

    public SportsActivityTracker() {
        activities = new ArrayList<>();
    }

    public void logActivity(String sport, int duration) {
        activities.add(new Activity(sport, duration));
        System.out.println("Activity logged: " + sport + " for " + duration + " minutes.");
    }

    public void viewActivities() {
        if (activities.isEmpty()) {
            System.out.println("No activities logged.");
        } else {
            System.out.println("Logged Activities:");
            for (Activity activity : activities) {
                System.out.println(activity);
            }
        }
    }

    public void calculateTotalTime() {
        int total = 0;
        for (Activity activity : activities) {
            total += activity.getDuration();
        }
        System.out.println("Total time spent on sports this week: " + total + " minutes.");
    }
}