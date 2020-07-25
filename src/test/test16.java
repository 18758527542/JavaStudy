package test;

public class test16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= i; k++) {
                int product = i * k;
                System.out.print(k + "¡Á" + i + "=" + product + "  ");
            }
            System.out.println(" ");
        }
    }
}
