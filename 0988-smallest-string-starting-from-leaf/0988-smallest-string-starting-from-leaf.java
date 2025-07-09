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
    String x="";
    void func(TreeNode root,String temp){
        if(root==null){
            return;
        }
        temp=(char)('a'+root.val)+temp;
        if(root.left==null && root.right==null){
            if(x=="" || temp.compareTo(x)<0){
                x=temp;
            }
        }
        func(root.left,temp);
        func(root.right,temp);
    }
    public String smallestFromLeaf(TreeNode root) {
        func(root,"");
        return x;
    }
}