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
    int func(TreeNode root,int arr[]){
        if(root==null) return 0;
        int left = func(root.left, arr);
        int right = func(root.right, arr);

        if (left + right > arr[0]) {
            arr[0] = left + right;
        }
        return 1 + Math.max(left, right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int arr[]={0};
        func(root,arr);
        return arr[0];
    }
}