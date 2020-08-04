package test;

import java.util.Scanner;

public class test39 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("������һ����1������֣�");
        int i = console.nextInt();
        double sum = 0;
        if (i < 1) {
            System.out.println("�������1������֣�");
        } else if (i % 2 == 0) {
            for (int k = 2; k <= i; k += 2) {
                sum += 1.0 / k;
            }
        } else {
            for (int k = 1; k <= i; k += 2) {
                sum += 1.0 / k;
            }
        }
        System.out.println("��Ϊ��" + sum);
    }
}
