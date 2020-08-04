package test;

import java.util.Arrays;

public class test18 {
    public static void main(String[] args) {
        //��abc��zyx������һ����ʾ���ǻ������
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[3];
        loop1:
        for (int i = 0; i < arr1.length; i++) {
            arr2[0] = i + 1;
            loop2:
            for (int k = 0; k < arr2.length; k++) {
                arr2[1] = k + 1;
                arr2[2] = 6 - arr2[0] - arr2[1];
                if (arr2[0] != arr1[0] && arr2[0] != arr2[1] && arr2[0] != arr2[2] && arr1[2] != arr2[0] && arr1[2] != arr2[2]) {
                    System.out.println(Arrays.toString(arr2));
                    break loop1;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr2.length; k++) {
                if (arr1[i] == arr2[k]) {
                    System.out.println("1�ӵ�" + (i + 1) + " vs 2�ӵ�" + (k + 1));
                }
            }
        }
    }
}
