import java.util.Calendar;

public class WeekDaysDisplay {
    
    public static void main(String[] args) {
        // Get the instance of Calendar
        Calendar calendar = Calendar.getInstance();
        
        // Array of days of the week
        String[] weekDays = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };
        
        // Display each day of the week
        System.out.println("The days of the week are:");
        for (String day : weekDays) {
            System.out.println(day);
        }
    }
}
