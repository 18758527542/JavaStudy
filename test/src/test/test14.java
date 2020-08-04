package test;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = console.nextInt();
        System.out.print("请输入月份：");
        int month = console.nextInt();
        while (month < 1 || month > 12) {
            System.out.println("请输入正确的月份！");
            System.exit(0);
        }
        System.out.print("请输入日号：");
        int day = console.nextInt();
        int i = 0;
        while (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day < 0 || day > 31) {
                System.out.println("请输入正确的日号！");
                System.exit(0);
            } else {
                break;
            }
        }
        while (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 0 || day > 30) {
                System.out.println("请输入正确的日号！");
                System.exit(0);
            } else {
                break;
            }
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            while (month == 2) {
                if (day < 0 || day > 29) {
                    System.out.println("请输入正确的日号！");
                    System.exit(0);
                } else {
                    break;
                }
            }
            switch (month) {
                case 1:
                    i = day;
                    break;
                case 2:
                    i = 31 + day;
                    break;
                case 3:
                    i = 60 + day;
                    break;
                case 4:
                    i = 91 + day;
                    break;
                case 5:
                    i = 121 + day;
                    break;
                case 6:
                    i = 152 + day;
                    break;
                case 7:
                    i = 182 + day;
                    break;
                case 8:
                    i = 213 + day;
                    break;
                case 9:
                    i = 244 + day;
                    break;
                case 10:
                    i = 274 + day;
                    break;
                case 11:
                    i = 305 + day;
                    break;
                case 12:
                    i = 336 + day;
                    break;
            }
        } else {
            while (month == 2) {
                if (day < 0 || day > 28) {
                    System.out.println("请输入正确的日号！");
                    System.exit(0);
                } else {
                    break;
                }
            }
            switch (month) {
                case 1:
                    i = day;
                    break;
                case 2:
                    i = 31 + day;
                    break;
                case 3:
                    i = 59 + day;
                    break;
                case 4:
                    i = 90 + day;
                    break;
                case 5:
                    i = 120 + day;
                    break;
                case 6:
                    i = 151 + day;
                    break;
                case 7:
                    i = 181 + day;
                    break;
                case 8:
                    i = 212 + day;
                    break;
                case 9:
                    i = 243 + day;
                    break;
                case 10:
                    i = 273 + day;
                    break;
                case 11:
                    i = 304 + day;
                    break;
                case 12:
                    i = 335 + day;
                    break;
            }
        }
        System.out.println("这一天是这一年的第" + i + "天");
    }
}
