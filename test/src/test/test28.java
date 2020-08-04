package test;

import java.util.Arrays;

public class test28 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) ((Math.random() * 100) + 1);
        }
        System.out.println("ԭ����" + Arrays.toString(arr));
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
        System.out.println("������" + Arrays.toString(arr));
    }
}
