package Ayberk.AVLTree;

public class AVLTree {
    Node root;

    int height(Node N){
        if(N == null)
            return 0;
        return N.height; //height attribute is within the node class
    }

    int max(int a, int b){
        return Math.max(a,b);
    }

    Node leftRotate(Node x){
        Node y = x.right;
        Node B = y.left; //technically right then left of x Node

        y.left = x; //x gets assigned to left of y, takes place of B (we still have access to B since we saved it above 'Node B = y.left')
        x.right = B;

        x.height = max(height(x.left),height(x.right)) + 1;
        y.height = max(height(y.left),height(y.right)) + 1;

        return y;
    }

    Node rightRotate(Node y){
        Node x = y.left; //  we are defining the variable x by naming it to be the 'left' of y - we are giving a pointer to the left side of y so we can use it (and 'split' it)
        Node B = x.right; //similarly, we are separating / assigning a pointer to the right side of x node
                            //we don't redefine the left hand side of x because we are not using it
        x.right = y; // since we will attach 'y' to the right side of x, we previously stored the value 'x.right' as B
                    // now that we have saved the right nodes of x, we will now redefine its right by replacing/assigning the y node (and its children) to it.
        // since we have stored&saved the 'x.right' under the variable name 'B' we can 'call it' and reassign it to the left of y node.
        //
        // Basically we have split / segmented the node and stored its values in the system by giving the split components variable names
        // and we re-piece them together by switching variables
        y.left = B;

        //** WE ARE UPDATING THE HEIGHTS** because we have moved around the nodes and the left/right of y/x is no longer it's old height
        y.height = max(height(y.left),height(y.right)) + 1; // max(LH,RH) function
        x.height = max(height(x.left), height(x.right)) + 1; // we find the maximum height by comparing the left and right
        // height(Node N) = height(y.left) - I'm sending in the y left node
        //all nodes have a 'height' attribute (which is stored)

        return x; // by returning x, we make the changes permanent within the code, otherwise the changes (rotation) would only stay within this function and not be applied to the general program
            // the reason we return 'x' is because after the rotation 'x' variable is now the top variable (y is attached to it below, on the right hand side)
            // returning x updates the child of the parent
    }

    private int getBalanceFactor(Node z){
        // LH - RH
        return height(z.left) - height(z.right);
    }

    public void insert(int data){ //this is a generic place-holder for the object in which we will be 'calling' this function
        this.root = insert(this.root,data);
    }

    private Node insert(Node node, int data) { //we don't want the user to access the root of the node, which is why we set it as private and create a publicly accessible version of this above
        if(node == null)
            return new Node(data);  // if the tree is empty we will have to 'create a Node'
        else if(data < node.item) // left insertion - if the data we want to insert is smaller than the head node, we proceed to insert it to the left
            node.left = insert(node.left,data); //continues going left until we see 'null'
        else if(data > node.item) // right insertion - if the data we want to insert is larger than the head node, we proceed to insert it to the right
            node.right = insert(node.right,data);
        else //if its not null, not smaller than head, not larger than head, then it must be equal
            return node; //we do not add new node if it already exists (so we just return the node)

        node.height = 1+ max(height(node.left),height(node.right));
        int balanceFactor = getBalanceFactor(node); // we find and assign the balance factor here

        if(balanceFactor > 1){ // if BF is greater than 1, then it must be skewed to the right, so to make this balance we will do a right rotation
            if(data < node.left.item){
                return rightRotate(node); //right rotate
            }
            else{
                node.left = leftRotate(node.left);
                return rightRotate(node); // left right rotate if the tree is left skewed (in a line too many nodes on the left)
            }
        }
        if(balanceFactor < -1){
            if(data > node.right.item){
                return leftRotate(node);
            }
            else{
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public void delete(int data){ //this is a generic place-holder for the object in which we will be 'calling' this function
        this.root = delete(this.root,data);
    }

    private Node delete(Node root, int data) {
        if(root == null)
            return null;
        else if(root.item < data) // only specifying the direction - whether we will go left or right - root.item is basically the number inside the node
            root.right = delete(root.right,data); //the delete function returns a node after deleting the one we specify, we reassign the node to connect it to the tree again
        else if(root.item > data)
            root.left = delete(root.left,data); //REMEMBER! The value returned in the 'else' statement below is assigned to right.left (basically redefining the left side of the tree)
        else{
            if(root.left == null){
                return root.right; //shifting (since we don't have another child on the left, we just connect the entire right node after deletion
            }
            else if(root.right == null){
                return root.left;
            }
            else{ //you could either take the largest fo the left or smallest of the right
                root.item = minValue(root.right); //assigning the new min data to the item - find the minimum value of the right, because we have to make sure that everything else on the right side is still bigger than the 'new node'
                root.right = delete(root.right,root.item); //reassign the node to the right
            //inorder successor tells us the only look at the right side which is why we don't look at the left
            }
        }
        //you are on the parent of the node that was deleted (right or left side) - which is why we are outside the 'if statement'
        root.height = 1 + max(height(root.left),height(root.right));
        int bf = getBalanceFactor(root);

        if (bf > 1){
            if(getBalanceFactor(root.left) >= 0){
                return rightRotate(root); //you are on top of where you are deleting
            }
            else{
               root.left = leftRotate(root.left);
               return rightRotate(root);
            }
        }
        if (bf < -1){
            if(getBalanceFactor(root.right) <= 0 ){
                return leftRotate(root);
            }
            else{
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }

        return root;
    }

    private int minValue(Node node) {
        int min = node.item;

        while(node.left != null){
            min = node.left.item;
            node = node.left; //this statement tells us to continue traversing left as long as it isn't null
        }

        return min;
    }

}
