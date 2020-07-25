package test;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        double sum = 100, length = 200;
        System.out.print("请输入落地次数：");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        if (x == 1) {
            sum = 100;
        } else if (x >= 2) {
            for (int i = 2; i <= x; i++) {
                length *= 0.5;
                sum += length;
            }
        }
        System.out.println("落地" + x + "次后，下落的总距离为" + sum + "米！还能弹"+length*0.25+"米高");
    }
}
