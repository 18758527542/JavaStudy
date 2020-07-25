package test;

import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入一个大于1小于20的数字:");
        int i = console.nextInt();
        if (i < 1 || i > 20) {
            System.out.println("您输入的数字不符合要求！");
            System.exit(0);
        }
        for (int k = 1; k <= 2*i-1; k++) {
            for (int j=1;j<=Math.abs(i-k);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=(i-Math.abs(i-k))*2-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
