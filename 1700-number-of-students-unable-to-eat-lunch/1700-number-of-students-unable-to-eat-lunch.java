class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
//         Queue<Integer> q = new LinkedList<>();
//         int top = 0, count = 0;

//         for(int e : students)
//             q.add(e);

//         while(!q.isEmpty() && count != q.size()){
//             if(q.peek() == sandwiches[top]) {
//                 count = 0;
//                 top++;
//                 q.poll();
//             } else {
//                 q.add(q.poll());
//                 count++;
//             }
//         }
//         return q.size();
        int count[] = {0, 0}, n = students.length, k;
        for (int a: students)
            count[a]++;
        for (k = 0; k < n && count[sandwiches[k]] > 0; ++k)
            count[sandwiches[k]]--;
        return n - k;
    }
}