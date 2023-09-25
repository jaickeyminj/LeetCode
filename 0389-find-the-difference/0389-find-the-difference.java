class Solution {
    public char findTheDifference(String s, String t) {
//         Map<Character,Integer> set = new HashMap<>();
        
//         for(char c: s.toCharArray()){
//             set.put(c,set.getOrDefault(c,0)+1);
//         }
//         char x=' ';
//         // System.out.println(set);
//         for(char c: t.toCharArray()){
//            if(set.containsKey(c)&& set.get(c)>0){
//                set.put(c,set.getOrDefault(c,0)-1);
//            } 
//             else{
//                 x=c;
//                 break;
//             }
//         }
//         return x;
        
        char c=0;
        
        for(char a:s.toCharArray()) c^=a;
        for(char a:t.toCharArray()) c^=a;
        return c;
    }
}