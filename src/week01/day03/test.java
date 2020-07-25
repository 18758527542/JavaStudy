package week01.day03;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("������һ������1������");
        int j = console.nextInt();
        int sum = test1(j);
        System.out.println("��1�ӵ�" + j + "�ĺ���" + sum);
    }

    public static int test1(int j) {
        int sum = 0;
        for (int i = 1; i <= j; i++) {
            sum += i;
        }
        return sum;
    }
}
