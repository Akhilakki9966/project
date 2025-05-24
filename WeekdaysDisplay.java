import java.text.DateFormatSymbols;

public class WeekdaysDisplay {
    public static void main(String[] args) {
        String[] weekdays = new DateFormatSymbols().getWeekdays();
        for (int i = 2; i < weekdays.length; i++) { // Skipping empty entries
            System.out.println(weekdays[i]);
        }
    }
}
