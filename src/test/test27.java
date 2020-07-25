package test;

import static java.lang.Math.sqrt;

public class test27 {
    public static void main(String[] args) {
        for (int i =2; i <= 100; i++){
            int k = 0;
            for (int j=2; j <= sqrt(i);j++){
                if(i%j==0){
                    k = 1;
                }
            }
            if(k == 0){
                System.out.println(i+"ÊÇËØÊý£¡");
            }
        }
    }
}
