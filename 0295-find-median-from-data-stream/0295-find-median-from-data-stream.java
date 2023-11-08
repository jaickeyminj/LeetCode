// import java.util.PriorityQueue;

class MedianFinder {
//     PriorityQueue<Integer> maxHeap; // on the left side to maintain the smallest
//     PriorityQueue<Integer> minHeap; // on the right side to maintain the largest

//     public MedianFinder() {
//         maxHeap = new PriorityQueue<>((a, b) -> b - a); // max heap
//         minHeap = new PriorityQueue<>(); // min heap
//     }

//     public void addNum(int num) {
//         if (maxHeap.isEmpty() || maxHeap.peek() >= num)
//             maxHeap.offer(num);
//         else
//             minHeap.offer(num);

//         balancingHeaps();
//     }

//     public double findMedian() {
//         if (maxHeap.size() > minHeap.size())
//             return (double) maxHeap.peek();
//         else if (minHeap.size() > maxHeap.size())
//             return (double) minHeap.peek();
//         else
//             return (maxHeap.peek() + minHeap.peek()) / 2.0;
//     }

//     private void balancingHeaps() {
//         while (maxHeap.size() > minHeap.size() + 1) {
//             minHeap.offer(maxHeap.poll());
//         }
//         while (minHeap.size() > maxHeap.size() + 1) {
//             maxHeap.offer(minHeap.poll());
//         }
//     }
    
    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> large = new PriorityQueue<>();
    private boolean even = true;

    public double findMedian() {
        if (even)
            return (small.peek() + large.peek()) / 2.0;
        else
            return small.peek();
    }

    public void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }
}