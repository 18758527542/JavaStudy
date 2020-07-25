package test;

import java.util.Arrays;
import java.util.Scanner;

public class test29 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入你需要几阶矩阵：");
        int a = console.nextInt();
        if (a <= 0) {
            System.out.println("请输入一个正整数！");
            System.exit(0);
        }
        int[][] arr = new int[a][a];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                arr[i][k] = (int) (Math.random() * 10 + 1);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("对角线之和为：" + sum);
    }
}
