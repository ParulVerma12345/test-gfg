/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {

    int ans = 0;

    int diameter(Node root) {

        height(root);

        return ans;
    }

    int height(Node root) {

        if (root == null)
            return 0;

        int left = height(root.left);

        int right = height(root.right);

        ans = Math.max(ans, left + right);

        return Math.max(left, right) + 1;
    }
}