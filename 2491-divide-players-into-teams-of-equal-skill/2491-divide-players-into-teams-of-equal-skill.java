class Solution {
    // public long dividePlayers(int[] skill) {
    //     Arrays.sort(skill);
    //     int ans = skill[0]+ skill[skill.length-1];
    //     long res =0;
    //     for(int i=0;i<skill.length/2;i+=1){
    //         if(ans != (skill[i]+skill[skill.length-i-1])){
    //             return -1;
    //         }
    //         res += (skill[i]*skill[skill.length-i-1]);
    //     }
    //     return res;
    // }
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int l = 0, r = skill.length - 1;
        long ans = 0, set = skill[l] + skill[r];
        while ( l < r ){
            if (set != (skill[l] + skill[r]) ) return -1;
            ans += skill[l] * skill[r];
            l+=1; 
            r-=1;
        }
        return ans;
    }

}