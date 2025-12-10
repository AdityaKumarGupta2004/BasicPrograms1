import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {
        // Get a Calendar instance
        Calendar c = Calendar.getInstance();
        System.out.print("\nToday Date and time is :->");
        // Set the Calendar's time to the current time
        c.setTime(new Date());

        // Format the time using DateFormat
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedTime = dateFormat.format(c.getTime());

        // Print the formatted time
        System.out.print("Formatted Time: " + formattedTime);
    }
}
