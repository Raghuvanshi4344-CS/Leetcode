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
    void func(List<String> re,TreeNode root,String x){
        if(root==null){
            return ;
        }
        x=x+String.valueOf(root.val);
        if(root.left==null && root.right==null){
            re.add(x);
        }
        func(re,root.left,x+"->");
        func(re,root.right,x+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> re=new ArrayList<>();
        func(re,root,"");
        return re;
    }
}