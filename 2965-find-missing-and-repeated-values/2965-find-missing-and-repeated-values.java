class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int num=grid.length;
        Set<Integer> nm=new HashSet<>();
        int ans[]=new int[2];
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                if(nm.contains(grid[i][j]))
                {
                    ans[0]=grid[i][j];
                }
                nm.add(grid[i][j]);
            }
        }
        num*=num;
        for(int i=1;i<=num;i++)
        {
            if(!nm.contains(i))
            {
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}