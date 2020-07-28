package week04.day02;

import java.util.ArrayList;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            m1();//这边会出现越界异常
            System.out.println("m1方法正常结束");
        } catch (RuntimeException e) {
            System.out.println("捕获到数组越界了");
            e.printStackTrace();
        }
        //遇到未处理的运行时异常，程序就直接终止了
        System.out.println("try-catch结束了");

        String[] sArr = new String[3];
        System.out.println(sArr[0].length());
        System.out.println("---------------");
        Object o = new String();

    }

    public static void m1() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList.get(4));
//        return arrayList.get(4);
    }
}
