package day01;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrVsLinked {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i <=10000000; i++) {
            arrayList.add(1 + " ");
            linkedList.add(1 + " ");
        }
        long time1 = System.currentTimeMillis();
        arrayList.get(10);
        long time2 = System.currentTimeMillis();
        System.out.println("ArrayList获取头部元素的时间" + (time2 - time1));
        long time3 = System.currentTimeMillis();
        linkedList.get(10);
        long time4 = System.currentTimeMillis();
        System.out.println("LinedList获取头部元素的时间" + (time4 - time3));

        long time5 = System.currentTimeMillis();
        arrayList.get(5000000);
        long time6 = System.currentTimeMillis();
        System.out.println("ArrayList获取中部元素的时间" + (time6 - time5));
        long time7 = System.currentTimeMillis();
        linkedList.get(5000000);
        long time8 = System.currentTimeMillis();
        System.out.println("LinedList获取中部元素的时间" + (time8 - time7));

        long time9 = System.currentTimeMillis();
        arrayList.get(10000000);
        long time10 = System.currentTimeMillis();
        System.out.println("ArrayList获取尾部元素的时间" + (time10 - time9));
        long time11 = System.currentTimeMillis();
        linkedList.get(10000000);
        long time12 = System.currentTimeMillis();
        System.out.println("LinedList获取尾部元素的时间" + (time12 - time11));
    }
}
