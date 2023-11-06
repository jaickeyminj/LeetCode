class Solution {
    public int largestInteger(int num) {
        if(num<10)
            return num;
        PriorityQueue<Integer> even = new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer> odd = new PriorityQueue<>((a,b)->b-a);
        
        int duplicateN = num;
        for(;num!=0;){
            int c = num%10;
            num=num/10;
            // if(c=='2'||c=='4'||c=='8'||c=='0'||c=='6'){
            if(c%2==0){
                even.offer(c);
            }else{
                odd.offer(c);
            }
        }
        num = duplicateN;
        int res=0;
        String n = num+"";
        for(char c: n.toCharArray()){
            int cc = Integer.parseInt(c+"");
            // num/=10;
            if(even.size()>0 && cc%2==0){
                res = res * 10 + even.poll();
            }
            else if(odd.size()>0 && cc%2!=0){
                res = res * 10 + odd.poll();
            }
            else if(odd.size()==0){
                res = res * 10 + even.poll();
            }
            else if(even.size()==0){
                res = res * 10 + odd.poll();
            }
            System.out.print(res);
        }
        System.out.println();
        return res;
    }
}