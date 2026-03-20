// class MedianFinder {
//     private ArrayList<Integer> list;
//     public MedianFinder() {
//         list=new ArrayList<>();
//     }
    
//     public void addNum(int num) {
//         list.add(num);
//         Collections.sort(list);
//     }
    
//     public double findMedian() {
//         int n=list.size();
//         if(n%2==0){
//             return (list.get(n/2-1)+list.get(n/2))/2.0;
//         }
//        return list.get(n/2);
//     }
// }

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */








import java.util.PriorityQueue;
import java.util.Collections;

class MedianFinder {
    private PriorityQueue<Integer> maxHeap; 
    private PriorityQueue<Integer> minHeap; 
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } else {
            return (maxHeap.peek() + minHeap.peek());
        }
    }
}