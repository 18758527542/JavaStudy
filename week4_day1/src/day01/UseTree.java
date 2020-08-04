package day01;

public class UseTree {
    public static void main(String[] args) {
        RecursionTree<String> tree = new RecursionTree<>();
        tree.add("rose");
        tree.add("tom");
        tree.add("jack");
        tree.add("jason");
        tree.add("???");
        tree.add("lucy");
        tree.add("john");
        tree.add("taylor");
        tree.travel();
    }
}
