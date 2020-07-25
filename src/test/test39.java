package test;

import java.util.Scanner;

public class test39 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入一个比1大的数字：");
        int i = console.nextInt();
        double sum = 0;
        if (i < 1) {
            System.out.println("请输入比1大的数字！");
        } else if (i % 2 == 0) {
            for (int k = 2; k <= i; k += 2) {
                sum += 1.0 / k;
            }
        } else {
            for (int k = 1; k <= i; k += 2) {
                sum += 1.0 / k;
            }
        }
        System.out.println("和为：" + sum);
    }
}
