package test;

import java.util.Scanner;

public class test24 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("������һ��������5λ����������");
        int a = console.nextInt();
        int b = check(a);
        System.out.println("�����������" + b + "λ����");
    }

    public static int check(int k) {
        int a = 0;
        if (k >= 100000 || k < 1) {
            System.out.println("����������ֲ�����");
            System.exit(0);
        } else if (k / 10000 >= 1) {
            a = 5;
        } else if (k / 1000 > 1) {
            a = 4;
        } else if (k / 100 > 1) {
            a = 3;
        } else if (k / 10 > 1) {
            a = 2;
        } else {
            a = 1;
        }
        return a;
    }
}
