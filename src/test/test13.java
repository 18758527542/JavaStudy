package test;

import static java.lang.Math.sqrt;

public class test13 {
    public static void main(String[] args) {
        double a,b;
        int c,d;
        for (int i=-100;;i++){
            a=sqrt(i+100);
            b=sqrt(i+168);
            if (a==(int)a&&b==(int)b){
                System.out.println("这个数是"+i);
                break;
            }
        }
    }
}
