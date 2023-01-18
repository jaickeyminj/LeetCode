import java.util.regex.Pattern;
class Solution {
    public int maximumValue(String[] strs) {
        Set<Integer> set = new TreeSet<>();
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        for(String s: strs){
            if(!pattern.matcher(s).matches()){
                set.add(Integer.parseInt(s));
            }
            else{
                set.add(s.length());
            }
        }
        int res =0;
        for(Integer i:set)
            res = i;
        return res;
    }
}