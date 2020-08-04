package day02;

import java.util.Arrays;

public class homeWork {
    public static void main(String[] args) {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 36 + 1);
            for (int j = 0; j < i; j++) {
                if (a == arr[j]) {
                    i--;
                }
            }
            arr[i] = a;
        }
        arr[6] = (int) (Math.random() * 16 + 1);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[i]) {
                    arr[j] = arr[j] + arr[i];
                    arr[i] = arr[j] - arr[i];
                    arr[j] = arr[j] - arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
