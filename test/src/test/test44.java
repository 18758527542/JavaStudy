package test;

public class test44 {
    public static void main(String[] args) {
        int a, b, c;
        for (a = 0; a < 20; a++) {
            for (b = 0; b < 33; b++) {
                for (c = 0; c < 300; c += 3) {
                    if (a * 5 + b * 3 + c / 3 == 100 && a + b + c == 100) {
                        System.out.println("������" + a + "ֻ��ĸ����" + b + "ֻ��С����" + c + "ֻ��");
                    }
                }
            }
        }
    }
}
