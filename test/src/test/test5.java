package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        System.out.print("���������ĳɼ���");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        String code;
        code = (a < 60) ? "C" : "B";
        code = (a >= 90) ? "A" : "B";
        System.out.println("���ĵȼ���" + code);
    }
}
