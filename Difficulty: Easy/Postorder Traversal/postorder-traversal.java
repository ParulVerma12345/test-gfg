/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/
class Solution {

    public ArrayList<Integer> postOrder(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        helper(root, ans);

        return ans;
    }

    void helper(Node root, ArrayList<Integer> ans) {

        if (root == null)
            return;

        helper(root.left, ans);

        helper(root.right, ans);

        ans.add(root.data);
    }
}