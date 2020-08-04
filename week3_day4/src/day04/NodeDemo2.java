package day04;

public class NodeDemo2 {
    public static void main(String[] args) {
        NodeDemo1 node=new NodeDemo1();
        node.add(10);
        node.add(15);
        node.add(20);
        node.add(25);
        node.insert(0,100);
        System.out.println(node.size());
        System.out.println(node);
    }
}
