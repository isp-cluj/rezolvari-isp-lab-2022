package isp.lab3.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println(tree);

        tree.grow(10);
        System.out.println(tree);

        System.out.println(tree.toString());
        System.out.println(tree);
        System.out.println(tree.getHeight());
    }
}
