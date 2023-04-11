class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c!='*'){
                st.push(c);
            }
            else{
                st.pop();
            }
        }
        StringBuilder sb  = new StringBuilder();
        Iterator it = st.iterator();
        while(it.hasNext()){
            sb.append((char)it.next());
        }
        return sb.toString();
    }
}