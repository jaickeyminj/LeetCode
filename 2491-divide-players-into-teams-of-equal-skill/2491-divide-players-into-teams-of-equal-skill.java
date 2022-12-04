class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int ans = skill[0]+ skill[skill.length-1];
        long res =0;
        for(int i=0;i<skill.length/2;i+=1){
            if(ans!= (skill[i]+skill[skill.length-i-1])){
                return -1;
            }
            res += (skill[i]*skill[skill.length-i-1]);
        }
        return res;
    }
}