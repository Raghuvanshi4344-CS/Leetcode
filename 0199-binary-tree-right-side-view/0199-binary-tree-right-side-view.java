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
        if (root==null) return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode current=queue.peek();
                temp.add(current.val);
                queue.remove();
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
            re.add(temp.get(temp.size() - 1));
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> re=new ArrayList<>();
        func(root,re);
        return re;
    }
}