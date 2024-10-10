import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Activity {
    private String sport;
    private int duration; // in minutes

    public Activity(String sport, int duration) {
        this.sport = sport;
        this.duration = duration;
    }

    public String getSport() {
        return sport;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return sport + ": " + duration + " minutes";
    }
}
