package week03.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class GenericDemo {
    public static void main(String[] args) {
        Generic generic = new Generic();
        Collection collection = new ArrayList();
        collection.add("hello");
        Date date;
        collection.add(date = new Date());
        generic.print("hello", date);
    }
}
