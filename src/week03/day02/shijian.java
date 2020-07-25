package week03.day02;

import java.util.Calendar;
import java.util.Date;

public class shijian {
    public static void main(String[] args) {
        //时间的格式的转换
        //1.Date--->long
        Date date1 = new Date();
        long time1 = date1.getTime();

        //2.long--->Date
        Date date2 = new Date(0l);
        date2.setTime(time1);

        //3.Calendar--->Date
        Calendar cal1 = Calendar.getInstance();
        Date date3 = cal1.getTime();

        //4.Date--->Calendar
        Date date4 = new Date(0l);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date4);

        //5.Calendar--->long
        long time2 = cal2.getTimeInMillis();
        System.out.println(time2);

        //6.long--->Calendar
        Calendar cal3 = Calendar.getInstance();
        cal3.setTimeInMillis(time1);
    }
}
