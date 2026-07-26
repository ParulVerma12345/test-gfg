/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        helper(root,ans);
        return ans;
        
    }
    void helper(Node root,ArrayList<Integer>ans){
        if(root==null)
        return;
        helper(root.left,ans);
        ans.add(root.data);
        helper(root.right,ans);
    }
}