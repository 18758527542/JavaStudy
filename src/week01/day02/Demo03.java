package week01.day02;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 1000) + 1;
        Scanner consloe = new Scanner(System.in);
        int cishu = 0;
        int guess = 0;
        do {
            cishu++;
            System.out.print("�뿪ʼ��ĵ�" + cishu + "�²⣬����-1������");
            guess = consloe.nextInt();
            if (guess == -1) {
                System.out.println("���ź�����Ϸ������");
                break;
            } else if (guess > x) {
                System.out.println("�����������̫���ˣ�");
            } else if (guess < x) {
                System.out.println("�����������̫С�ˣ�");
            }
        } while (guess != x);
        if (guess == x) {
            System.out.println("��ϲ����������" + cishu + "�Ͳ¶�����");
        }
    }
}
