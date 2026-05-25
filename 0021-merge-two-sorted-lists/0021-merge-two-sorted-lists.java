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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res=new ListNode();
        ListNode tem=res;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                tem.next=new ListNode(list2.val);
                list2=list2.next;
            }
            else{
                tem.next=new ListNode(list1.val);
                list1=list1.next;
            }
            tem=tem.next;
        }
        while(list1!=null){
            tem.next=new ListNode(list1.val);
            list1=list1.next;
            tem=tem.next;
        }
        while(list2!=null){
            tem.next=new ListNode(list2.val);
            list2=list2.next;
            tem=tem.next;
        }
        return res.next;
    }
}