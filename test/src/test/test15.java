package test;

import java.util.Arrays;
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] arr = new int[3];
        //����������������������
        for (int i = 0; i < arr.length; i++) {
            System.out.print("�������" + (i + 1) + "�����֣�");
            arr[i] = console.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("�����������֮ǰ��ͬ�����֣�");
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int k;
                    k = arr[j];
                    arr[j] = arr[i];
                    arr[i] = k;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
