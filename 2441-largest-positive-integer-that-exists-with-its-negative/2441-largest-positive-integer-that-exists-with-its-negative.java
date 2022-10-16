class Solution {
    public int findMaxK(int[] nums) {
        int map[]= new int[1001];
        int map2[] = new int[1001];
        // Arrays.fill(map,1);
        for(int i: nums){
            if(i<0)
                map[i*-1]=1;
            else
                map2[i]=1;
        }
        for(int i=1000;i>0;i--){
            if(map[i]!=0 &&map[i]==map2[i])
                return i;
        }
        return -1;
    }
}