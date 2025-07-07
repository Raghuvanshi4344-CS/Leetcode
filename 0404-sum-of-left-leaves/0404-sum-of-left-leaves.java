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
class Solution {
    void helper(TreeNode root,int s[]){
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            s[0]+=root.left.val;
        }
        helper(root.left,s);
        helper(root.right,s);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int s[]=new int[1];
        helper(root,s);
        return s[0];
    }
}