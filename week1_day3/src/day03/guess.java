package day03;

import java.util.Arrays;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char[] question = question();
        System.out.println(Arrays.toString(question));
        int cishu = 0;
        do {
            cishu++;
            System.out.print("��Ϸ��ʼ������������"+cishu+"�β²�Ľ����");
            char[] answer = readConsole(console);
            System.out.println(Arrays.toString(answer));
            int[] result = result(question, answer);
            System.out.println("���ĵ�" + cishu + "�β²⣬�ܹ��¶���" + result[0] + "�� ��ĸ������λ��Ҳ��ȷ����" + result[1] + "��������exit�˳���Ϸ��");
            if (result[1]==5){
                System.out.println("���ܹ�����"+cishu+"�Σ���Ϸ������");
                break;
            }
        } while (true);
    }

    //�������һ������Ϊ5���ַ�����
    public static char[] question() {
        char[] arr = new char[5];
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 26 + 65);
            for (int j = 0; j < i; j++) {
                if (a == arr[j]) {
                    i--;
                }
            }
            arr[i] = (char) (a);
        }
        return arr;
    }

    //��ȡ�������ĸ������ת�����ַ�����
    public static char[] readConsole(Scanner console) {
        String str = console.nextLine();
        char[] chars = new char[str.length()];
        //�Ƚ�������ַ����Ƿ�Ϊexit������ǿ���˳�
        if (chars.equals("exit")){
            System.exit(0);
        }
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    //�Ƚ���������
    public static int[] result(char[] right, char[] guess) {
        int[] result= new int[2];
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < guess.length; j++) {
                if (right[i] == guess[j]) {
                    result[0]++;
                    if (i == j) result[1]++;
                    break;
                }
            }
        }
        return result;
    }
}
