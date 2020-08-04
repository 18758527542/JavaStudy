package day01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //创建队列--先进先出
        Queue<String> queue = new LinkedList<>();
        //进队列的办法
        queue.offer("haha");
        queue.offer("heihei");
        queue.offer("hehe");
        System.out.println(queue);
        //获取队列头元素的办法
        String string = queue.peek();//只是查访问
        System.out.println(string);
        System.out.println(queue);
        string = queue.poll();//获取队列头元素，并将元素从队列中删除
        System.out.println(string);
        System.out.println(queue);
    }
}
