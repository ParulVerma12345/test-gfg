/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {

    ArrayList<Integer> rightView(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                Node curr = q.poll();

                // Last node of every level
                if (i == size - 1)
                    ans.add(curr.data);

                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null)
                    q.add(curr.right);
            }
        }

        return ans;
    }
}