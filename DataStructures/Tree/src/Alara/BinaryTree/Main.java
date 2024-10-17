package Alara.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // insert("--..", "Z");

        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(7);
        tree.root.right.right = new Node(14);
        tree.root.right.left = new Node(13);

        System.out.println("Inorder Traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Preorder Traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.println("PostOrder Traversal: ");
        tree.postOrderTraversal(tree.root);
    }
}
