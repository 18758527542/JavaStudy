package week03.day04;

public class NodeDemo1 {
    public class Node {
        private int data;//用于存储数据
        private Node next;//用于存下一个结点的地址（是一个引用）

        public Node(int data) {
            this.data = data;
        }
    }

    //最开始初始化链表时，head不存数据，next是null
    private Node head = new Node(0);//head中的0不是真正的数据，应该是不存放数据的
    //要从下一个数据开始，下标才是0开始，data才有数值

    //添加新的结点
    public void add(int a) {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(a);
    }

    private Node getIndexPreNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //插入新的结点
    public void insert(int index, int a) {
        //先找到上一个结点，用上一个结点的next直接指向即将插入的元素
        Node node = getIndexPreNode(index);
        Node newNode = new Node(a);
        newNode.next = node.next;
        node.next = newNode;
    }

    //删除结点
    public void remove(int index) {
        Node node = getIndexPreNode(index);
        node.next = node.next.next;
    }

    public int size() {
        int count = 0;
        Node node = head;
        while (node.next!=null){
            node=node.next;
            count++;
        }
        return count;
    }

    public String toString() {
        Node node = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        node = node.next;
        while (node.next != null) {
            sb.append(node.data);
            sb.append(", ");
            node = node.next;
        }
        sb.append(node.data);
        sb.append("]");
        return sb.toString();
    }
}
