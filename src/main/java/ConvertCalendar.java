import java.util.Calendar;
/**
 * Converts given time to digital and day to integer according to the
 * day order.
 */
public class ConvertCalendar {
    public static String convertHour(int hour) {
        if(hour < 10) {
            return "0" + hour + ":00";
        }
        return hour + ":00";
    }

    public static int convertDay(int day) {
        int dayofWeek = -1;
        if(day == Calendar.MONDAY) {
            dayofWeek = 1;
        }
        if(day == Calendar.TUESDAY) {
            dayofWeek = 2;
        }
        if(day == Calendar.WEDNESDAY) {
            dayofWeek = 3;
        }
        if(day == Calendar.THURSDAY) {
            dayofWeek = 4;
        }
        if(day == Calendar.FRIDAY) {
            dayofWeek = 5;
        }
        if(day == Calendar.SATURDAY) {
            dayofWeek = 6;
        }
        if(day == Calendar.SUNDAY) {
            dayofWeek = 0;
        }
        return dayofWeek;
    }
}

