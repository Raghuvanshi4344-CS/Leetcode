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
    void func(TreeNode root,int arr[],int temp){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(temp>arr[0]){
                arr[0]=temp;
            }
        }
        temp++; 
        func(root.left,arr,temp);
        func(root.right,arr,temp);
    }
    public int maxDepth(TreeNode root) {
        int arr[]=new int[1];
        arr[0]=0;
        func(root,arr,1);
        return arr[0];
    }
}