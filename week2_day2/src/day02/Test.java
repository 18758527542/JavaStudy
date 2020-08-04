package day02;

import java.util.Arrays;

public class Test {
    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;
    final int[] arr = {1, 2, 3, 4, 5};

    public Test() {
        arr[4] = 100;
        System.out.println(Arrays.toString(arr));
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
