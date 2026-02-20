/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.Queue;
class Solution {
    public static void left(TreeNode root, Queue<Integer>q){
        if(root==null) return;
        q.add(root.val);
        left(root.left,q);
    }
    public static void right(TreeNode root, Queue<Integer>q){
        if(root==null) return;
        q.add(root.val);
        right(root.right,q);
    }
    public boolean isSymmetric(TreeNode root) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> x=new LinkedList<>();
        left(root,q);
        right(root,x);
        if(q.equals(x)) return true;
        return false;
    }
}