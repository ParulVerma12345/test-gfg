/*
Definition for Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data  =d;
        left = right = null;
    }
}
*/
class Solution {

    ArrayList<Integer> zigZagTraversal(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {

            int size = q.size();

            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                Node curr = q.poll();

                if (leftToRight)
                    temp.add(curr.data);
                else
                    temp.add(0, curr.data);

                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null)
                    q.add(curr.right);
            }

            ans.addAll(temp);

            leftToRight = !leftToRight;
        }

        return ans;
    }
}