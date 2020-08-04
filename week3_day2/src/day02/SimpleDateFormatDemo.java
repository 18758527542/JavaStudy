package day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //Date--->SimpleDateFormat
        Date date1 = new Date();
        System.out.println(date1);
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss  E");
        String str1 = sf1.format(date1);
        System.out.println(str1);

        //SimpleDateFormat--->Date
        String str2 = "19990909";
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyyMMdd");
        Date date2 = sf2.parse(str2);
        System.out.println(sf1.format(date2));

    }
}
