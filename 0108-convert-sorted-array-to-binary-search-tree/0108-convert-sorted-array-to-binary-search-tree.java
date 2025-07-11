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
    TreeNode func(int arr[],int left,int right){
        if(left>right) return null;
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=func(arr,left,mid-1);
        root.right=func(arr,mid+1,right);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] arr) {
        return func(arr,0,arr.length-1);
    }
}