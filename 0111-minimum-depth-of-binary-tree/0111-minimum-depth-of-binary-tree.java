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
    void func(TreeNode root,int arr[],int c){
        if(root==null) return;
        c++;
        if(root.left==null && root.right==null){
            if(arr[0]>c){
                arr[0]=c;
            }
        }
        func(root.left,arr,c);
        func(root.right,arr,c);
    }
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int arr[]={100000};
        func(root,arr,0);
        return arr[0];
    }
}