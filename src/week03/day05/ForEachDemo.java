package week03.day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ForEachDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("haha");
        collection.add("heihei");
        collection.add("hehe");
        collection.add("hiahia");
        collection.add("zhuzhu");
        //简化版的迭代器(增强版的for--->forEach)
        // :左边每一次迭代取出的元素
        // :右边是要进行迭代的集合/数组
        // 注意:forEach不能使用remove,如果要删除必须用迭代器的remove功能
//        for (String s : collection) {
//            System.out.println(s);
//        }
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
            iterator.remove();
        }
        System.out.println(collection);
    }
}
