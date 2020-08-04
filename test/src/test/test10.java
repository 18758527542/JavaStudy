package test;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        double sum = 100, length = 200;
        System.out.print("��������ش�����");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        if (x == 1) {
            sum = 100;
        } else if (x >= 2) {
            for (int i = 2; i <= x; i++) {
                length *= 0.5;
                sum += length;
            }
        }
        System.out.println("���" + x + "�κ�������ܾ���Ϊ" + sum + "�ף����ܵ�"+length*0.25+"�׸�");
    }
}
