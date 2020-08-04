package day02;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        System.out.println(year + " " + (month + 1) + " " + day + " " + hour + " " + minute + " " + second);
//        cal.set(Calendar.MONTH, Calendar.AUGUST);
//        cal.set(Calendar.DAY_OF_MONTH, 25);
//        System.out.println(cal);
//        Calendar date = Calendar.getInstance();
//        System.out.println(date);
        cal.add(Calendar.YEAR, 10);
        cal.set(Calendar.WEEK_OF_MONTH, 3);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        Date date=cal.getTime();
        System.out.println(date);
    }
}
