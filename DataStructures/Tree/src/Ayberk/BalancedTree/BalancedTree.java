package Ayberk.BalancedTree;

public class BalancedTree {
    Node root;

    boolean checkBalance(Node root, Height height){ //we tell the function that we will be inputting a height object (but will create the height obj in Main class)
        if(root == null){
            height.height = 0; //calling the height attribute of the height object of current node
            return true;
        }

        Height LH = new Height(); //create new object called 'LH' of Height class type - represents Left Height of current node
        Height RH = new Height();

        boolean isLeftBalanced = checkBalance(root.left, LH);
        boolean isRightBalanced = checkBalance(root.right, RH);

        height.height = Math.max(LH.height,RH.height) + 1;

        if(Math.abs(LH.height - RH.height) > 1){ //write absolute value so as not to have to repeat -1 and 1
            return false;
        }
        else{
            return isLeftBalanced && isRightBalanced;
        }
    }
}
