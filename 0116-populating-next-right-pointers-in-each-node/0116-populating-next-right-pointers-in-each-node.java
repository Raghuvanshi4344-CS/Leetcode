/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    // void func(Node root){
    //     if(root==null) return;
    //     Queue<Node> q=new LinkedList<>();
    //     q.add(root);
    //     while(!q.isEmpty()){
    //         int size = q.size();
    //         Node prev = null;

    //         for (int i = 0; i < size; i++) {
    //             Node curr = q.poll();
    //             if (prev != null) {
    //                 prev.next = curr;
    //             }
    //             prev = curr;
    //             if (curr.left != null) q.add(curr.left);
    //             if (curr.right != null) q.add(curr.right);
    //         }
    //     }
    // }
    public Node connect(Node root) {
        // func(root);
        // return root;
        if (root == null || root.left == null || root.right == null) {
            return root;
        }

        root.left.next = root.right;

        if (root.next != null) {
            root.right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);

        return root;
    }
    
}