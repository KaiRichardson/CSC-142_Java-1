// Represents a time span of hours and minutes elapsed.
// Class invariant: minutes < 60

public class TimeSpan {
    private int hours;
    private int minutes;

    // Constructs a time span with the given interval.
    // pre: hours >= 0 && minutes >= 0
    public TimeSpan(int hours, int minutes) {
        this.hours = 0;
        this.minutes = 0;
        add(hours, minutes);
    }

    // Adds the given interval to this time span.
    // pre: hours >= 0 && minutes >= 0
    public void add(int hours, int minutes) {
        this.hours += hours;
        this.minutes += minutes;

        // convert each 60 minutes into one hour
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    // Returns the number of minutes stored in this TimeSpan object.
    public int getHours() {
        return hours;
    }

    // Returns the number of minutes stored in this TimeSpan object.
    public int getMinutes() {
        return minutes;
    }

    // Returns a String for this time span such as "6h15m".
    public String toString() {
        return hours + "h" + minutes + "m";
    }

    // YOUR CODE GOES HERE
    public void add(TimeSpan span) {
        this.minutes += span.minutes;
        this.hours += span.hours + this.minutes / 60;
        this.minutes %= 60;
    }

}