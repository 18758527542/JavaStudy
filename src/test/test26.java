package test;

import java.util.Scanner;

public class test26 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String day = console.nextLine();
        String first = day.substring(0, 1), second = day.substring(1, 2);
        switch (first) {
            case "m":
                System.out.println("今天是星期一！");
                break;
            case "t":
                switch (second) {
                    case "u":
                        System.out.println("今天是星期二！");
                        break;
                    case "h":
                        System.out.println("今天是星期四！");
                        break;
                    default:
                        System.out.println("您输入的不合法！");
                        System.exit(0);
                }
                break;
            case "w":
                System.out.println("今天是星期三！");
                break;
            case "f":
                System.out.println("今天是星期五！");
                break;
            case "s":
                switch (second) {
                    case "a":
                        System.out.println("今天是星期六！");
                        break;
                    case "u":
                        System.out.println("今天是星期日！");
                        break;
                    default:
                        System.out.println("您输入的不合法！");
                        System.exit(0);
                }
            default:
                System.out.println("您输入的不合法！");
                System.exit(0);
        }
    }
}
