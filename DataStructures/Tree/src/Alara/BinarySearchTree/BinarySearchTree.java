package Alara.BinarySearchTree;

public class BinarySearchTree {
    Node root;

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (data < root.data) {
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
        if (root != null) { // l p r
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private Node delete(Node root, int data) {
        if (root == null) {
            return null;
        } else if (data < root.data) {
            root.left = delete(root.left, data); //reassigning the left root - recursion
        } else if (data > root.data) {
            root.right = delete(root.right, data); //reassigning the right root - recursion transferring data
        } else { // actual deletion part
            if (root.left == null && root.right == null) {
                return null;
            }
            else if(root.left != null && root.right == null){
                return root.left; //return kullaniyoruz ki bir ust scope a bu bilgiyi gonderelim
            }
            else if(root.left == null && root.right != null){
                return root.right; //return kullaniyoruz ki bir ust scope a bu bilgiyi gonderelim
            }
            else {
                root.data = minValue(root.right); //find the leftmost node of the right root, then assign the leftmost node of the right root to the root.data
                root.right = delete(root.right,root.data); //
            }
        }
        return root;
    }

    public int minValue(Node root){
        int min = root.data;
        while(root.left != null){
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
}
