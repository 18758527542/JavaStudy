package test;

import java.util.Scanner;

public class test26 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String day = console.nextLine();
        String first = day.substring(0, 1), second = day.substring(1, 2);
        switch (first) {
            case "m":
                System.out.println("����������һ��");
                break;
            case "t":
                switch (second) {
                    case "u":
                        System.out.println("���������ڶ���");
                        break;
                    case "h":
                        System.out.println("�����������ģ�");
                        break;
                    default:
                        System.out.println("������Ĳ��Ϸ���");
                        System.exit(0);
                }
                break;
            case "w":
                System.out.println("��������������");
                break;
            case "f":
                System.out.println("�����������壡");
                break;
            case "s":
                switch (second) {
                    case "a":
                        System.out.println("��������������");
                        break;
                    case "u":
                        System.out.println("�����������գ�");
                        break;
                    default:
                        System.out.println("������Ĳ��Ϸ���");
                        System.exit(0);
                }
            default:
                System.out.println("������Ĳ��Ϸ���");
                System.exit(0);
        }
    }
}
