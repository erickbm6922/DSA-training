package dsa.training.brocode.trees;

/*
 * Tree = a non-linear data structure where nodes are organized in a hierarchy
 * @author Erick Borda
 * @note Applications: File explorer, databases, DNS. HTML DOM
 */
public class TreeExample {

    public static void binarySearchTreeDisplayExample() {
        BinarySearchTreeExample tree = new BinarySearchTreeExample();
        tree.insert(new NodeT(5));
        tree.insert(new NodeT(1));
        tree.insert(new NodeT(9));
        tree.insert(new NodeT(2));
        tree.insert(new NodeT(7));
        tree.insert(new NodeT(3));
        tree.insert(new NodeT(6));
        tree.insert(new NodeT(4));
        tree.insert(new NodeT(8));

        tree.display();
    }

    public static void binarySearchTreeSearchExample(int value) {
        BinarySearchTreeExample tree = new BinarySearchTreeExample();
        tree.insert(new NodeT(5));
        tree.insert(new NodeT(1));
        tree.insert(new NodeT(9));
        tree.insert(new NodeT(2));
        tree.insert(new NodeT(7));
        tree.insert(new NodeT(3));
        tree.insert(new NodeT(6));
        tree.insert(new NodeT(4));
        tree.insert(new NodeT(8));

        System.out.println(tree.search(value));
    }

    public static void binarySearchTreeRemoveExample(int value) {
        BinarySearchTreeExample tree = new BinarySearchTreeExample();
        tree.insert(new NodeT(5));
        tree.insert(new NodeT(1));
        tree.insert(new NodeT(9));
        tree.insert(new NodeT(2));
        tree.insert(new NodeT(7));
        tree.insert(new NodeT(3));
        tree.insert(new NodeT(6));
        tree.insert(new NodeT(4));
        tree.insert(new NodeT(8));

        System.out.println("-> Tree before remove");
        tree.display();
        tree.remove(value);
        System.out.println("-> Tree after remove");
        tree.display();

    }
}
