package Ayberk.BinaryTree;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            // L P R
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            // P L R
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }

    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            // L R P
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
}
