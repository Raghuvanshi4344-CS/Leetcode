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
        if(head==null) return null;
        ListNode f=head,s=head;
        int ff=0;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            if(f==s){
                ff=1;
                break;
            }
        }
        if (ff==0) return null;
        ListNode temp=head;
        while(temp!=s){
            temp=temp.next;
            s=s.next;
        }
        return temp;
    }
}