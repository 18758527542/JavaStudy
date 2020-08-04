package day03;

public class ZhengzeDemo {
    public static void main(String[] args) {
        String string = "1111111111111";
        String regex = "[1]{2,5}";
        boolean b = string.matches(regex);
        System.out.println(b);
    }
}
