package day03;

import java.util.Arrays;

public class arrCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] newArr = new int[8];
        System.arraycopy(arr, 0, newArr, 0, 6);
        arr = newArr;
        System.out.println(Arrays.toString(arr));

        int[] newArr2 = {1, 2, 3, 4, 5, 6};
        newArr2 = Arrays.copyOf(newArr2, 9);
        System.out.println(Arrays.toString(newArr2));
    }
}


