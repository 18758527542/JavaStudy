package test;

import static java.lang.Math.sqrt;

public class test9 {
    public static void main(String[] args) {
        for (int k = 3; k <= 1000; k++) {
            int s = check(k);
            if (s == k) {
                System.out.println(k + "ÊÇÍêÊý£¡");
            }
        }
    }

    public static int check(int k) {
        int sum = 1;
        for (int i = 2; i <= k / 2; i++) {
            if (k % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
