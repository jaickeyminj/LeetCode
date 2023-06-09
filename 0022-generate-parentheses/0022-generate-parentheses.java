class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        calculate(al,sb,n,0,0);
        return al;
    }
    
    public void calculate(List<String> list,StringBuilder sb, int n, int openN, int closeN){
        if(openN==closeN && closeN == n){
            list.add(sb.toString());
            return;
        }
        
        if(openN<n){
            sb.append("(");
            calculate(list,sb,n,openN+1,closeN);
            sb.deleteCharAt(sb.length()-1);
        }
        if(closeN<openN){
            sb.append(")");
            calculate(list,sb,n,openN,closeN+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}