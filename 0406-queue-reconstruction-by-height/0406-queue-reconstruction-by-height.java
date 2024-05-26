class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        // List<int[]> list = new LinkedList<>();
        // for (int[] p : people) {
        //     list.add(p[1], p);
        // }
        // return list.toArray(new int[list.size()][]);
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (p1, p2) -> p1[0] != p2[0] ? p2[0] - p1[0] : p1[1] - p2[1]);
        
        for (int[] p : people) {
            pq.add(p);
        }
        
        
        // 2.
        List<int[]> answer = new ArrayList<>();
        
        while (!pq.isEmpty()) {
            int[] person = pq.poll();
            answer.add(person[1], person);
        }
        
        // 3.
        return answer.toArray(new int[answer.size()][2]);  
    }
}