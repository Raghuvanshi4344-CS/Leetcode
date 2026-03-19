class Solution {
    public List<List<Integer>> getSkyline(int[][] arr) {
        List<int[]> events=new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            int left=arr[i][0];
            int right=arr[i][1];
            int height=arr[i][2];
            events.add(new int[]{left, -height});  
            events.add(new int[]{right, height});         
        }

        Collections.sort(events,(a,b)->{
            if (a[0]!=b[0]) return a[0]-b[0];
            return a[1]-b[1];
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(0);
        int prevMax=0;
        List<List<Integer>> result=new ArrayList<>();
        for (int[] event : events) {
            int x=event[0];
            int h=event[1];

            if (h<0) {
                pq.add(-h);
            } else {
                pq.remove(h);
            }
            int currMax=pq.peek();
            if (currMax!=prevMax) {
                result.add(Arrays.asList(x, currMax));
                prevMax=currMax;
            }
        }

        return result;
    }
}