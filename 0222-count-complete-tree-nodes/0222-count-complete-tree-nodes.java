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
    void helper(List<Integer> temp,TreeNode root){
        if(root==null)return;
        temp.add(root.val);
        helper(temp,root.left);
        helper(temp,root.right);
    }
    public int countNodes(TreeNode root) {
        List<Integer> temp=new ArrayList<>();
        helper(temp,root);
        // int x=temp.size();
        return temp.size();
    }
}