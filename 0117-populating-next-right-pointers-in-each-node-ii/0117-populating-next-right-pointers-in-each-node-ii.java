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


class Solution{
    private Node getNext(Node node) {
        while (node != null) {
            if (node.left != null) return node.left;
            if (node.right != null) return node.right;
            node = node.next;
        }
        return null;
    }
    public Node connect(Node root){
        if(root ==null) return null;
        if (root.left != null) {
            root.left.next = root.right != null ? root.right : getNext(root.next);
        }
        
        if (root.right != null) {
            root.right.next = getNext(root.next);
        }

        connect(root.right);
        connect(root.left);
        return root;
    }
}













    // class Solution {
    //     public static void left(Node root){
    //         if (root == null || root.left == null) return;
    //         root.left.next = root.right;
    //         left(root.left);
    //         left(root.right);
    //     }
    //     public static void right(Node root){
    //         if (root == null || root.right == null) return;
    //         if (root.next != null) {
    //             root.right.next = root.next.left;
    //         }
    //         right(root.left);
    //         right(root.right);
    //     }
    //     public Node connect(Node root) {
    //         if (root == null) return null;
    //         left(root);
    //         right(root);
    //         return root;
    //     }
    // }
