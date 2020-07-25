package week03.day05;

public class Tree {
    private class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int a) {
            this.data = a;
        }
    }

    private Node root;

    public void add(int a) {
        //先判断二叉树有无根结点
        if (root == null) {
            root = new Node(a);
            return;
        }
        Node node = root;//记录每一次的当前结点
        Node parentNode;//记录每一次当前结点的父节点

        while (true) {
            parentNode = node;//原来的结点--->后来的父节点
            if (a < node.data) {//如果新加入的数据比中间结点小
                node = node.left;
                if (node == null) {
                    parentNode.left = new Node(a);
                    return;
                }
            } else if (a > node.data) {//如果新加入的结点比中间结点大
                node = node.right;
                if (node == null) {
                    parentNode.right = new Node(a);
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void travelNode(Node node) {
        if (node.left != null) {
            travelNode(node.left);
        }
        System.out.println(node);
        if (node.right != null) {
            travelNode(node.right);
        }
    }

    public void travel() {
        if (root != null) {
            travelNode(root);
        }
    }
}
