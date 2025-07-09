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
    void func(TreeNode root,int sum,List<List<Integer>> re,List<Integer>temp,int s){
        if(root==null){
            return ;
        }
        s=s+root.val;
        temp.add(root.val);
        if(root.left==null && root.right==null ){
            if(s==sum){
            re.add(new ArrayList<>(temp));
            }
        }
        func(root.left,sum,re,new ArrayList<>(temp),s);
        func(root.right,sum,re,new ArrayList<>(temp),s);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> re=new ArrayList<>();
        func(root,targetSum,re,new ArrayList<>(),0);
        return re;
    }
}