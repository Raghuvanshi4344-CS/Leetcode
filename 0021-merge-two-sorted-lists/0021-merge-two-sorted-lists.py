class Solution:
    def mergeTwoLists(self, list1, list2):
        if list1 is None:
            return list2
        if list2 is None:
            return list1

        dummy = ListNode()
        res = dummy

        while list1 is not None and list2 is not None:
            if list1.val < list2.val:
                res.next = list1
                list1 = list1.next
            else:
                res.next = list2
                list2 = list2.next
            
            res = res.next

        if list1 is not None:
            res.next = list1
        
        if list2 is not None:
            res.next = list2

        return dummy.next