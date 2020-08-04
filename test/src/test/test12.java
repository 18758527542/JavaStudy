package test;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        System.out.print("����������������Ԫ����");
        Scanner console = new Scanner(System.in);
        double profit = console.nextDouble();
        double bonus;
        if (profit < 0) {
            System.out.println("���������������ϱ�׼��");
        } else if (profit <= 10) {
            bonus = profit * 0.1;
            System.out.println("�����Եõ��Ľ�������Ϊ��" + bonus + "��Ԫ��");
        } else if (profit <= 20) {
            bonus = (profit - 10) * 0.075 + 1;
            System.out.println("�����Եõ��Ľ�������Ϊ��" + bonus + "��Ԫ��");
        } else if (profit <= 40) {
            bonus = (profit - 20) * 0.05 + 1.75;
            System.out.println("�����Եõ��Ľ�������Ϊ��" + bonus + "��Ԫ��");
        } else if (profit <= 60) {
            bonus = (profit - 40) * 0.03 + 2.75;
            System.out.println("�����Եõ��Ľ�������Ϊ��" + bonus + "��Ԫ��");
        } else if (profit <= 100) {
            bonus = (profit - 60) * 0.015 + 3.35;
            System.out.println("�����Եõ��Ľ�������Ϊ��" + bonus + "��Ԫ��");
        } else {
            bonus = (profit - 100) * 0.01 + 3.95;
            System.out.println("�����Եõ��Ľ�������Ϊ��" + bonus + "��Ԫ��");
        }
    }
}
