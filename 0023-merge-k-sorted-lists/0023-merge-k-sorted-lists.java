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
    ListNode merge(ListNode a,ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(a!=null && b!=null){
            if(a.val>b.val){
                temp.next=b;
                temp=temp.next;
                b=b.next;
            }
            else{
                temp.next=a;
                temp=temp.next;
                a=a.next;
            }
        }
        if(a!=null) temp.next=a;
        if(b!=null) temp.next=b;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res=null;
        for(int i=0;i<lists.length;i++){
            res=merge(res,lists[i]);
        }
        return res;
    }
}