/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode func(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return null;
        if(root==p || root==q) return root;
        TreeNode left=func(root.left,p,q);
        TreeNode right=func(root.right,p,q);
        if(left!=null && right!=null) return root;
        if(left!=null) return left;
        if(right!=null) return right;
        return null;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return func(root,p,q);
    }
}