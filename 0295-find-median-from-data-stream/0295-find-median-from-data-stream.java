// import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> maxHeap; // on the left side to maintain the smallest
    PriorityQueue<Integer> minHeap; // on the right side to maintain the largest

    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a); // max heap
        minHeap = new PriorityQueue<>(); // min heap
    }

    public void addNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() >= num)
            maxHeap.offer(num);
        else
            minHeap.offer(num);

        balancingHeaps();
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size())
            return (double) maxHeap.peek();
        else if (minHeap.size() > maxHeap.size())
            return (double) minHeap.peek();
        else
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }

    private void balancingHeaps() {
        while (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        }
        while (minHeap.size() > maxHeap.size() + 1) {
            maxHeap.offer(minHeap.poll());
        }
    }
}