class Solution:
    def merge(self, a, b):
        dummy = ListNode()
        temp = dummy

        while a is not None and b is not None:
            if a.val < b.val:
                temp.next = a
                a = a.next
            else:
                temp.next = b
                b = b.next

            temp = temp.next

        if a is not None:
            temp.next = a

        if b is not None:
            temp.next = b

        return dummy.next

    def mergeKLists(self, lists):
        res = None

        for i in range(len(lists)):
            res = self.merge(res, lists[i])

        return res