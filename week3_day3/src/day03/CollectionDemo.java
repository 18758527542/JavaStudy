package day03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("heihei");
        collection.add("haha");
        collection.add("xixi");
        System.out.println(collection.size());
        System.out.println(collection.contains("hehe"));
        collection.add("hehe");
        collection.remove("xixi");//返回值是boolean类型的，判断是否已经移除了
        System.out.println(collection);
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        collection.clear();
        System.out.println(collection.isEmpty());
    }
}
