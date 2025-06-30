/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        int ff=0;
        ListNode temp=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                ff=1;
                break;
            }
        }
        if(ff==0){
            return null;
        }
        while(temp!=s){
            temp=temp.next;
            s=s.next;
        }
        return temp;
        
    }
}