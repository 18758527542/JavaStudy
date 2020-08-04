package test;

import java.util.Scanner;

public class test25 {
    public static void main(String[] args) {
        int b, c, d, e;
        Scanner console = new Scanner(System.in);
        System.out.print("������һ����λ����");
        int a = console.nextInt();
        if (a < 10000 || a > 99999) {
            System.out.println("�������������������������֣�");
        } else {
            b = a / 10000;//��һλ
            c = a % 10;//���һλ
            d = (a / 1000) % 10;//�ڶ�λ
            e = (a % 100) / 10;//�����ڶ�λ
            if (b == c && d == e) {
                System.out.println("����������ǻ�������");
            } else {
                System.out.println("������������ǻ�������");
            }
        }
    }
}
