package week01.day03;

import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fangfa()));
    }
    public static char[] fangfa(){
        char[] arr = new char[5];
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 26 + 65);
            arr[i] = (char)(a);
        }
        return arr;
    }
}
