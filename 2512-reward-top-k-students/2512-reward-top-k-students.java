import java.util.Map.Entry;
class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        int score[] = new int[student_id.length];
        Map<String,String> positive = new HashMap<>();
        Map<String,String> positive2 = new HashMap<>();
        Queue<StudentData> q = new PriorityQueue();
        for(String a:positive_feedback){
            positive.put(a,positive.getOrDefault(""+a, ""));
        }
        for(String a:negative_feedback){
            positive2.put(a,positive2.getOrDefault(""+a, ""));
        }
        for(int i=0;i<student_id.length;i+=1){
            for(String j: report[i].split("\\s+")){
                if(positive2.containsKey(j))
                    score[i]-=1;
                else if(positive.containsKey(j))
                    score[i]+=3;
            }
            q.offer(new StudentData(student_id[i], score[i]));
            // System.out.println(q);
            if (q.size() > k) q.poll();
        }
        List<Integer> result = new LinkedList<Integer>();
        while (!q.isEmpty()){
            result.add(0, q.poll().id);
        }
        return result;
        
    }
}
class StudentData implements Comparable<StudentData> {
    public int id, score;
    public StudentData(int studentId, int score) {
        this.id = studentId;
        this.score = score;
    }
    public int compareTo(StudentData other) {
        if (this.score == other.score) {
            return other.id - this.id; 
        }
        return this.score - other.score;
    }
    public String toString(){
        return id+"->"+score;
    }
}