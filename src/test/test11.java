package test;

import java.util.Arrays;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner console = new Scanner(System.in);
        //读取数字，存放到数组当中
        for (int i = 0; i <= 3; i++) {
            System.out.print("请输入第" + (i + 1) + "个一位数：");
            arr[i] = console.nextInt();
            if (arr[i] < 0 || arr[i] > 9) {
                System.out.println("请输入0-9的数字！");
                i--;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("不可以输入和之前相同的数字！");
                    i--;
                    break;
                }
            }
        }
        int sum = 0;
        int count = 0;
        //组成三位数
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i != j && i != k && j != k && arr[i] != 0) {
                        sum = arr[i] * 100 + arr[j] * 10 + arr[k];
                        count++;
                        System.out.print(sum + ",");
                    }
                }
            }
        }
        System.out.println("总共可以组成" + count + "个三位数");
    }
}
