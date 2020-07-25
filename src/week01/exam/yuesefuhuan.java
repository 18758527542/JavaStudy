package week01.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class yuesefuhuan {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("请输入参加游戏的人数：");
        int people = console.nextInt();
        if (people < 1) {
            System.out.println("人数输入错误！");
            System.exit(0);
        }
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 1; i <= people; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        int i = 0;
        while (arr.size() > 1) {
            i += 2;
            if (i < arr.size()) {
                arr.remove(i);
                if (i >= arr.size()) {
                    i -= arr.size();
                }
            } else {
                i -= arr.size();
                arr.remove(i);
            }

        }
        System.out.println(arr.get(0));

    }
}
