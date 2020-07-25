package test;

import java.util.Arrays;
import java.util.Scanner;

public class test31 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入数组有多少数字：");
        int a = console.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个数字:");
            arr[i] = console.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < (arr.length / 2); i++) {
            int k;
            k = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = k;
        }
        System.out.println(Arrays.toString(arr));
    }
}
