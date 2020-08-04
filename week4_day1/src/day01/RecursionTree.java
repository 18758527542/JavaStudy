package day01;

//用递归的方式实现二叉树
public class RecursionTree<T> {
    private class Node<T> {
        private T data;
        private Node left;
        private Node right;

        public Node(T t) {
            this.data = t;
        }

        @Override
        public String toString() {
            return "" + data;
        }
    }

    private Node root;

    private void addNode(Node node, T t) {
        if (((Comparable) t).compareTo(node.data) < 0) {
            if (node.left == null) {
                node.left = new Node<T>(t);
                return;
            }
            addNode(node.left, t);
        } else if (((Comparable) t).compareTo(node.data) > 0) {
            if (node.right == null) {
                node.right = new Node<T>(t);
                return;
            }
            addNode(node.right, t);
        }
    }

    public void add(T t) {
        if (root == null) {
            root = new Node(t);
            return;
        }
        Node node = root;
        addNode(node, t);
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
        } else {
            System.out.println("该二叉树为空！");
        }
    }
}
