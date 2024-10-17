package Ayberk.AVLTree;

public class Node {
    int item, height;
    Node left,right;

    Node(int item){
        this.item = item;
        this.height = 1; //when you form a node, the height starts from 1 (which is why we define this as 1)
    }
}
