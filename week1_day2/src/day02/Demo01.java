package day02;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner consloe = new Scanner(System.in);
		System.out.print("�����뵥�ۣ�Ԫ����");
		double a = consloe.nextDouble();
		System.out.print("������������");
		int b = consloe.nextInt();
		System.out.print("�������Ԫ����");
		double c = consloe.nextDouble();
		double d = a*b;
		if (d>=500) {
			d *= 0.8;
		}
		if(c>=d) {
			c -= d;
			System.out.println("Ӧ�ս��Ϊ"+d+"Ԫ������Ϊ"+c+"Ԫ");
		}else {
			System.out.println("������˼����Ǯ������");
		}
	}
}
