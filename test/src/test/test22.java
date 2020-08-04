package test;

import java.util.Scanner;

public class test22 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("������һ����������");
        int product = 1;
        int a = console.nextInt();
        if (a <= 0) {
            System.out.println("����������ֲ�����");
            System.exit(0);
        }
        for (int i = 1; i <= a; i++) {
            product *= i;
        }
        System.out.println(a + "�Ľ׳���" + product);
    }
}
