package test;

import java.util.Scanner;

public class test25 {
    public static void main(String[] args) {
        int b, c, d, e;
        Scanner console = new Scanner(System.in);
        System.out.print("请输入一个五位数：");
        int a = console.nextInt();
        if (a < 10000 || a > 99999) {
            System.out.println("数字输入有误！请输入合理的数字！");
        } else {
            b = a / 10000;//第一位
            c = a % 10;//最后一位
            d = (a / 1000) % 10;//第二位
            e = (a % 100) / 10;//倒数第二位
            if (b == c && d == e) {
                System.out.println("您输入的数是回文数！");
            } else {
                System.out.println("您输入的数不是回文数！");
            }
        }
    }
}
