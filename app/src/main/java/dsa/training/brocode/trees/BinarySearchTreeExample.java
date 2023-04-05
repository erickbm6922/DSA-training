package dsa.training.brocode.trees;

/**
 * Binary Search tree = a tree data structure, where each node is greater than
 * it's left child,
 * but less than it's right
 * 
 * @implNote Benefit: easy to locate a node when they are in this order
 *           Time complexity: best case O(log n)
 *           worst case O(n)
 * 
 * @author Erick Borda
 */
public class BinarySearchTreeExample {
    NodeT root;

    public void insert(NodeT nodeT) {
        root = insertHelper(root, nodeT);
    }

    private NodeT insertHelper(NodeT root, NodeT node) {
        int data = node.data;
        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(NodeT root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(NodeT root, int data) {

        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {
        if (search(data)) {
            removeHelper(root, data);
        } else {
            System.out.println(data + " could not be found");
        }
    }

    public NodeT removeHelper(NodeT root, int data) {
        if (root == null) {
            return null;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else {
            // NODE FOUND OR LEAF NODE
            if (root.left == null && root.right == null) {

            } else if (root.right != null) {
                // Find successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);

            } else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    /**
     * Method that find least value below the right child of this root node
     * 
     * @param root Value of the root Node
     * @return Data of the root Node
     */
    private int successor(NodeT root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    /**
     * Method that find greatest value below the right child of this root node
     * 
     * @param root Value of the root Node
     * @return Data of the root Node
     */
    private int predecessor(NodeT root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

}
