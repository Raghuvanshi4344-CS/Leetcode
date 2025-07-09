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
    boolean x=false;
    void func(TreeNode root,int sum,int s){
        if(root==null){
            return;
        }
        s+=root.val;
        if(root.left == null && root.right == null && sum == s){
            x=true;
        }
        func(root.left,sum,s);
        func(root.right,sum,s);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        func(root,targetSum,0);
        return x;
    }
}