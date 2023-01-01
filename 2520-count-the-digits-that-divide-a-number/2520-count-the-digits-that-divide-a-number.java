class Solution {
    public int countDigits(int num) {
//         List<Integer> set = new ArrayList<>();
//         int copyNum = num;
        
//         while(copyNum>0){
//             int last = copyNum%10;
//             if(num%last==0)
//                 set.add(last);
//             copyNum/=10;
//         }
//         // System.out.println(set);
//         return set.size();
        
        int res = 0;
        for (int n = num; n > 0; n /= 10)
            res += (num % (n % 10)) == 0?1:0;
        return res;
    }
}