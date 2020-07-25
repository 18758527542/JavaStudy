package week03.day02;

import java.util.Date;

public class TimeDemo {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(date);
        time += 180l * 24 * 60 * 60 * 1000;
        date.setTime(time);
        System.out.println(date);
        Date date1=new Date(0l);
        Boolean b1=date.after(date1);
        if (b1){
            System.out.println("您现在的时间晚于0l所表示的时间");
        }
    }
}
