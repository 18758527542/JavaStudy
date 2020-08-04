package test;

import java.util.Arrays;
import java.util.Scanner;

public class test29 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("����������Ҫ���׾���");
        int a = console.nextInt();
        if (a <= 0) {
            System.out.println("������һ����������");
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
        System.out.println("�Խ���֮��Ϊ��" + sum);
    }
}
