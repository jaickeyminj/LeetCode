import java.util.regex.Pattern;
class Solution {
    // public int maximumValue(String[] strs) {
    //     Set<Integer> set = new TreeSet<>();
    //     Pattern pattern = Pattern.compile(".*[^0-9].*");
    //     for(String s: strs){
    //         if(!pattern.matcher(s).matches()){
    //             set.add(Integer.parseInt(s));
    //         }
    //         else{
    //             set.add(s.length());
    //         }
    //     }
    //     int res =0;
    //     for(Integer i:set)
    //         res = i;
    //     return res;
    // }
    public int maximumValue(String[] strs) {
        int i,j,maxValue=0;
        for(i=0;i<strs.length;i++){
            j=0;
            while(j< strs[i].length() && 
                  (strs[i].charAt(j) >= '0' && strs[i].charAt(j) <= '9')){
                j++;
            }
            if(strs[i].length()==j){
                maxValue = Math.max(maxValue,Integer.parseInt(strs[i]));
            }else{
                maxValue= Math.max(maxValue,strs[i].length());
            }
        }        
        return maxValue;
    }
}