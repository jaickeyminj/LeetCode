class Solution {
    public boolean isSubstringPresent(String s) {
        
        Set<String> set=new HashSet<>();
        for(int i=0;i<s.length()-1;i++)
        {
            // added the substring in the set (of length 2)
            set.add(s.substring(i,i+2));
        }
        // iterate from last because reveresOrder
        for(int i=s.length()-1;i>0;i--)
        {
            StringBuilder s1=new StringBuilder();
            s1.append(s.charAt(i));
            s1.append(s.charAt(i-1));
            // check if the substring is present in the set
            if(set.contains(s1.toString())){
                return true;
            }
        }
        return false;
    }
}