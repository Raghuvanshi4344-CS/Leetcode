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
    void func(TreeNode root,List<List<Integer>> re){
        if(root==null) return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        // int levelNum=0; 
        while(!queue.isEmpty()){
            int level=queue.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode current=queue.peek();
                temp.add(current.val);
                queue.remove();
                
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
            // if (levelNum % 2 == 1) {
            //     int left = 0, right = temp.size() - 1;
            //         while (left < right) {
            //         int t = temp.get(left);
            //         temp.set(left, temp.get(right));
            //         temp.set(right, t);
            //         left++;
            //         right--;
            //     }
            // }
            if(re.size()%2!=0){
                Collections.reverse(temp);
            }
            re.add(temp);
            // levelNum++;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> re=new ArrayList<>();
       func(root,re);
       return re; 
    }
}