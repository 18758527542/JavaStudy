package test;

import java.util.Arrays;

public class test20 {
    public static void main(String[] args) {
        double quotient = 0, sum = 0;
        double[] rabbit = new double[21];
        rabbit[0] = 1;
        rabbit[1] = 2;
        for (int i = 2; i < rabbit.length; i++) {
            rabbit[i] = rabbit[i - 1] + rabbit[i - 2];
        }
        System.out.println(Arrays.toString(rabbit));
        for (int i = 1; i <= 20; i++) {
            quotient = rabbit[i] / rabbit[i - 1];
            sum += quotient;
        }
        System.out.println(sum);
    }
}
