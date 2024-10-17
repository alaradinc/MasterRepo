package Ayberk.BalancedTree;

public class Main {
    public static void main(String[] args) {
        Height height = new Height();

        BalancedTree tree = new BalancedTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(6);

        if(tree.checkBalance(tree.root,height))
            System.out.println("Tree is balanced!");
        else
            System.out.println("Tree is not balanced!");
    }
}
