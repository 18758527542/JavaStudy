package day02;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class test6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int a = console.nextInt();
        System.out.print("再输入一个正整数：");
        int b = console.nextInt();
        int min, max;
        for (int i = 1; i < a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i + "是最小公倍数！");
                break;
            }
        }
        for (int j = (int) sqrt(a); j >= 1; j--) {
            if (a % j == 0 && b % j == 0) {
                System.out.println(j + "是最大公约数！");
                break;
            }
        }
    }
}
