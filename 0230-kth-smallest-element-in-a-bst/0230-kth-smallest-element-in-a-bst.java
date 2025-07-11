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
    void func(TreeNode root,List<Integer> re){
        if(root==null) return;
        func(root.left,re);
        re.add(root.val);
        func(root.right,re);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> re=new ArrayList<>();
        func(root,re);
        return re.get(k - 1);
    }
}