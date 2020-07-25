package test;

import static java.lang.Math.sqrt;

public class test2 {
    public static void main(String[] args) {
        for (int i =101; i <= 200; i++){
            int k = 0;
            for (int j=2; j <= sqrt(i);j++){
                if(i%j==0){
                    k = 1;
                }
            }
            if(k == 0){
                System.out.println(i+"是素数！");
            }
        }
    }
}
