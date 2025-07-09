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
    void func(TreeNode root,int s[],int n){
        if(root==null){
            return;
        }
        n=n*10+root.val;
        if(root.left==null && root.right==null){
            s[0]+=n;
        }
        func(root.left,s,n);
        func(root.right,s,n);
    }
    public int sumNumbers(TreeNode root) {
        int s[]=new int[1];
        func(root,s,0);
        return s[0];
    }
}