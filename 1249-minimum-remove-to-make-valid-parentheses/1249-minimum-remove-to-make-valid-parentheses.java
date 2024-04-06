class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                st.push(c);
                sb.append(c);
            }
            else if(c==')'){
                if(st.size()>0){
                    st.pop();
                    sb.append(c);
                }
            }
            else{
                sb.append(c); //append normal alpabets
            }
            // System.out.println(sb.toString()+" -> "+st.toString());
        }
        int size = st.size();
        // System.out.println(size);
        if(size>0){
            char x[] = sb.toString().toCharArray();
            int j=0;
            for(int i=x.length-1;i>=0&&size>0;i--){
                if(x[i]=='('){
                    size--;
                    x[i]='#';
                }
            }
            sb.setLength(0);
            for(int i=0;i<x.length;i++){
                if(x[i]!='#'){
                    sb.append(x[i]);
                }
            }
            // System.out.println(Arrays.toString(x));
            return ""+sb.toString();
        }
        return sb.toString();
    }
}