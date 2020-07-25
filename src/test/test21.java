package test;

public class test21 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 20; i++) {
            long     product = 1;
            for (int k = 1; k <= i; k++) {
                product *= k;
            }
            System.out.println(product);
            sum += product;
        }
    }
}
