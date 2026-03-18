// class Solution {
//     public int findKthLargest(int[] arr, int k) {
//         Map<Integer,Integer> map=new HashMap<>();
//         int re=0;
//         while(k>0){
//             int max=-1;
//             for(int i=0;i<arr.length;i++){
//                 if (!map.containsKey(i)&&(max==-1||arr[i]>arr[max])){
//                     max=i;
//                 }
//             }
//             map.put(max,arr[max]);
//             re=arr[max];
//             k--;
//         }
//         return re;
//     }
// }


class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}