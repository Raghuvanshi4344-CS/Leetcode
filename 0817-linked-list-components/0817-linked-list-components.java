// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public int numComponents(ListNode head, int[] nums) {
//         LinkedList<Integer> tem=new LinkedList<Integer>();
//         ListNode temp=head;
//         int x=0;
//         while(temp!=null ){
//             LinkedList<Integer> templ = new LinkedList<Integer>();
//             int a = temp.val;
//             templ.add(a);
//             if (temp.next != null) {
//                 int b = temp.next.val;
//                 templ.add(b);
//             }
//             for(int i=0;i<nums.length;i++){
//                 if(templ.contains(nums[i])){
//                     tem.add(nums[i]);
//                     templ.remove(Integer.valueOf(nums[i]));
//                 }
//             }
//             if(Math.abs(tem.size()-nums.length)==1){
//                 x++;
//             }
//             else if(templ.isEmpty()) x++;
//             temp=temp.next;
//         }
//         // System.out.println(tem.size());
//         return x;
//     }
// }
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int n : nums) numSet.add(n);

        int count = 0;
        boolean inComponent = false;

        while (head != null) {
            if (numSet.contains(head.val)) {
                if (!inComponent) {
                    count++;          // new component starts
                    inComponent = true;
                }
            } else {
                inComponent = false; // component ended
            }
            head = head.next;
        }

        return count;
    }
}