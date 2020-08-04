package test;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class test4 {
    public static void main(String[] args) {
        System.out.print("������һ����������");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        System.out.print(x + "=");
        for (int i = 2; i <= x/2; i++) {
            while (x%i==0){
                System.out.print(i);
                x=x/i;
            }
        }
        if (x>1){
            System.out.println(x);
        }
    }
}
