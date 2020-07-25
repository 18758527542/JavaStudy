package week01.day01;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100 + 1));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int k = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, k);
                } else if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }
}