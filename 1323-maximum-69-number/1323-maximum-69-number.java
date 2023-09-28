class Solution {
    public int maximum69Number (int num) {
//         String d = num+"";
        
//         int max = Integer.MIN_VALUE;
//         int n= d.length();
//         // System.out.println(d.subString(0));
//         int x=0;
//         for(int i=0;i<n;i++){
//             if(d.charAt(i)==9){
//                 x = Integer.parseInt(d.substring(0,i)+"6"+d.substring(i+1));
//                 if(x>max) max =x;
//             }
//             else{
//                 x = Integer.parseInt(d.substring(0,i)+'9'+d.substring(i+1));
//                 if(x>max) max =x;
//             }
//         }
//         return max;
         // return Integer.parseInt(("" + num).replaceFirst("6", "9"));
        int n = num, index = -1, i = 0;
        while(n > 0){
            if(n % 10 == 6) index = i;
            n /= 10;
            i++;
        }
        return (index == -1) ? num : (num + 3 * (int)Math.pow(10, index));
    }
}