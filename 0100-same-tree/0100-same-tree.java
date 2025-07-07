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
    void func(TreeNode root,List<Integer> temp){
        if(root==null){
            temp.add(null);
            return;
        }
        temp.add(root.val);
        func(root.left,temp);
        func(root.right,temp);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> temp1=new ArrayList<>();
        func(p,temp1);
        List<Integer> temp2=new ArrayList<>();
        func(q,temp2);
        return temp1.equals(temp2);
    }
}