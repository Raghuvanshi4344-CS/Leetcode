/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // public ListNode sort(ListNode head){
    //     while(head.next!=null){
    //         ListNode temp=head.next;
    //         while(temp.next!=null){
    //             if(head.val>=temp.val){
    //                 int x=temp.val;
    //                 temp.val=head.val;
    //                 head.val=x;
    //             }
    //             temp=temp.next;
    //         }
    //         head=head.next;
    //     }
    //     return head;
    // }
    public ListNode duplicate(ListNode head){
        while(head!=null && head.next!=null){
            if(head.val==head.next.val && head.next.next!=null){
                head.next=head.next.next;
            }
            else if(head.val==head.next.val){
                head.next=null;
            }
            else{
                head=head.next;
            }
        }
        return head;
    }
    public ListNode deleteDuplicates(ListNode head) {
        // sort(head);
        if (head==null) return head;
        duplicate(head);
        return head;
    }
}