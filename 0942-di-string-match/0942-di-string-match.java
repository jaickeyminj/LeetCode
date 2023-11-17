class Solution {
    public int[] diStringMatch(String s) {
        //use Stack
        
        Stack<Integer> st = new Stack<>();
        int res[] = new int[s.length()+1];
        int cnt = 0;
        int index = 0;
        for(char c: s.toCharArray()){
            if(c=='I'){
                st.push(cnt);
                cnt+=1;
                
                while(!st.isEmpty()){
                    res[index++] = st.pop();
                }
            }else{
                st.push(cnt);
                cnt+=1;
            }
        }
        st.push(cnt);
        
        while(!st.isEmpty()){
            res[index++] = st.pop();
        }
        return res;
    }
}