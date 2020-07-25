package week02.day01;

public class ArrayListTest {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList();
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
