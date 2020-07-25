package test;

import java.util.Arrays;

public class test18 {
    public static void main(String[] args) {
        //设abc和zyx的数字一样表示他们互相比赛
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
                    System.out.println("1队的" + (i + 1) + " vs 2队的" + (k + 1));
                }
            }
        }
    }
}
