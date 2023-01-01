class Solution {
    public int countDigits(int num) {
        List<Integer> set = new ArrayList<>();
        int copyNum = num;
        
        while(copyNum>0){
            int last = copyNum%10;
            if(num%last==0)
                set.add(last);
            copyNum/=10;
        }
        // System.out.println(set);
        return set.size();
    }
}