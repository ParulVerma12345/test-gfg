/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {

    boolean isBalanced(Node root) {

        if (root == null)
            return true;

        int left = height(root.left);
        int right = height(root.right);

        if (Math.abs(left - right) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    int height(Node root) {

        if (root == null)
            return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}