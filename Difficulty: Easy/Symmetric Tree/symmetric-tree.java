/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {

    public boolean isSymmetric(Node root) {

        if (root == null)
            return true;

        return mirror(root.left, root.right);
    }

    boolean mirror(Node left, Node right) {

        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        if (left.data != right.data)
            return false;

        return mirror(left.left, right.right)
                && mirror(left.right, right.left);
    }
}