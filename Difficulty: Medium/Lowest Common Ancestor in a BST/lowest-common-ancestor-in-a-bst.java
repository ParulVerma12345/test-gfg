/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {

    Node LCA(Node root, Node p, Node q) {

        if (root == null)
            return null;

        if (root.data > p.data && root.data > q.data)
            return LCA(root.left, p, q);

        if (root.data < p.data && root.data < q.data)
            return LCA(root.right, p, q);

        return root;
    }
}