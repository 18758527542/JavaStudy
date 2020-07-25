package test;

public class test1 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 0;
        for(int m = 3; m <= 15; m++){
            sum = i+j;
            i = j;
            j = sum;
            System.out.println("第"+m+"月一共有"+sum+"只兔子！");
        }
    }
}
