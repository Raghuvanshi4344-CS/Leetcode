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
    public ListNode merge(ListNode a,ListNode b){
        ListNode dum=new ListNode(0);
        ListNode temp=dum;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                temp.next=a;
                a=a.next;
                temp=temp.next;
            }
            else{
                temp.next=b;
                b=b.next;
                temp=temp.next;
            }
        }
        if(a!=null){
            temp.next=a;
            }
        if(b!=null){
            temp.next=b;
        }
        return dum.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
    ListNode res = null;
    for (int i = 0; i < lists.length; i++) {
        if (lists[i] != null) {
            res = merge(res, lists[i]);
        }
    }
    return res;
    }
}