package week03.day04;

import java.util.Objects;

public class Stack<T> {
    private Objects[] data;//定义一个用于存放数据的数组
    private int size;//表示栈中元素的个数

    public Stack(int cap) {//cap表示栈的最大容量
        data = new Objects[cap];
    }

    public void push(T a) {
        data[size++] = (Objects) a;
    }

    public T pop() {
        T a = (T) data[size - 1];
        size--;
        return a;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "size=" + size +
                '}';
    }
}
