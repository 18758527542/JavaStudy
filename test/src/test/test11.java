package test;

import java.util.Arrays;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner console = new Scanner(System.in);
        //��ȡ���֣���ŵ����鵱��
        for (int i = 0; i <= 3; i++) {
            System.out.print("�������" + (i + 1) + "��һλ����");
            arr[i] = console.nextInt();
            if (arr[i] < 0 || arr[i] > 9) {
                System.out.println("������0-9�����֣�");
                i--;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("�����������֮ǰ��ͬ�����֣�");
                    i--;
                    break;
                }
            }
        }
        int sum = 0;
        int count = 0;
        //�����λ��
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
        System.out.println("�ܹ��������" + count + "����λ��");
    }
}
