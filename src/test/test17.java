package test;

public class test17 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 10; i >= 1; i--) {
            System.out.println("第" + i + "天早上还剩" + k + "个桃子");
            k = (k + 1) * 2;
        }
    }
}
