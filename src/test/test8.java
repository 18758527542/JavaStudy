package day02;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        int a, b;
        long x,sum=0;
        Scanner console = new Scanner(System.in);
        System.out.print("请输入a的值：");
        a = console.nextInt();
        System.out.print("请输入有几个值相加：");
        b = console.nextInt();
        if (a > 9 || a < 1) {
            System.out.println("只能输入1-9的正整数！");
        } else {
            x=a;
            for (int i = 1; i <= b; i++) {
                x=x*10+a;
                sum+=x;
            }
        }
        System.out.println("s=a+aa+aaa+aaaa+aa...a="+sum);
    }
}
