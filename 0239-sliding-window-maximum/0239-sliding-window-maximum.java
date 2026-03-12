// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         if (nums==null || nums.length==0 || k<=0) return new int[0];
//         if (k > nums.length) {
//             int max = Integer.MIN_VALUE;
//             for (int n : nums) {
//                 if (n > max) max = n;
//             }
//             return new int[]{max};
//         }
//         Queue<Integer> q=new LinkedList<>();
//         int x=0;
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             if(max<nums[i]) max=nums[i];
//             if(i==x+k-1){
//                 q.add(max);
//                 x++;
//                 i=x-1;
//                 max=Integer.MIN_VALUE;
//             }
//         }
//         int arr[]=new int[q.size()];
//         int i=0;
//         while(!q.isEmpty()){
//             arr[i++]=q.poll();       
//         }
//         return arr;
//     }
// }


import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0) return new int[0];

        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>(); // stores indices

        for(int i = 0; i < n; i++) {
            // remove indices out of window
            while(!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // remove smaller elements from back
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i); // add current index

            // store result for window
            if(i >= k - 1) {
                res[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}