package Ayberk.BinarySearchTree;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    void insert(int data) {
        this.root = insert(root, data);
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public void delete(int data) {
        this.root = delete(root,data);
    }

    private Node delete(Node root, int data) {
        if(root == null){
            return null;
        }

        if(data < root.data){
            root.left = delete(root.left, data);
        }
        else if(data > root.data){
            root.right = delete(root.right,data);
        }
        else{
            if(root.right == null && root.left == null){
                return null; // case1
            }
            else if(root.left != null && root.right == null){
                return root.left; // case2
            }
            else if(root.left == null && root.right != null){
                return root.right; // case2
            }
            else{
                root.data = minValue(root.right);           // case3
                root.right = delete(root.right,root.data);
            }
        }
        return root;
    }

    private int minValue(Node node) {
        int min = node.data;

        while(node.left != null){
            min = node.left.data;
            node = node.left;
        }
        return min;
    }
}
