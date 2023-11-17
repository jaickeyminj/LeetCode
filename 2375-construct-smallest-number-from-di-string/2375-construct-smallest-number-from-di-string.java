class Solution {
    public String smallestNumber(String pattern) {
        
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for(char c: pattern.toCharArray()){
            if(c=='I'){
                st.push(cnt);
                cnt+=1;
                
                while(!st.isEmpty()){
                    sb.append(st.pop()+"");
                }
            }else{
                st.push(cnt);
                cnt+=1;
            }
        }
        st.push(cnt);
        
        while(!st.isEmpty()){
            sb.append(st.pop()+"");
        }
        return sb.toString();
    }
}