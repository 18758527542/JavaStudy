package test;

import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("������һ������1С��20������:");
        int i = console.nextInt();
        if (i < 1 || i > 20) {
            System.out.println("����������ֲ�����Ҫ��");
            System.exit(0);
        }
        for (int k = 1; k <= 2*i-1; k++) {
            for (int j=1;j<=Math.abs(i-k);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=(i-Math.abs(i-k))*2-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
