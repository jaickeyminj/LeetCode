class Solution {
    public String finalString(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char c: s.toCharArray()){
            if(c!='i'){
                st.push(c);
            }
            else{
                while(!st.isEmpty()){
                    st2.push(st.pop());
                }
                st =(Stack<Character>) st2.clone();
                st2 = new Stack<>();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return ""+sb.reverse().toString();
    }
}