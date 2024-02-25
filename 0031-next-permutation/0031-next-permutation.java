class Solution {
    public void nextPermutation(int[] nums) {
        int i=0;
        
        int n= nums.length;
        if(n<2) return;
        for(i=n-1; i>0;i--){
            if(nums[i]>nums[i-1]) break;
        }
        if(i==0) {
            // int[] res = new int[n];
            int start =0;
            int end = nums.length - 1;
            int temp;
          
            while (start < end)
            {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            // for (int j = i; j< res.length; j++)
            //   res[j] = nums[ind--];
        }
        else{
            //find smallest on right side
            for (int j = n - 1; j >= i; j--){
                    if (nums[i - 1] <nums[j]){
                        System.out.println(nums[i-1]+"->"+nums[j] +"->"+nums[i]);
                      int temp = nums[j];
                      nums[j] = nums[i - 1];
                      nums[i - 1] = temp;
                      break;
                    }
            }
            // System.out.println(min +" "+(i-1));
            //reverse the right side
            // int[] res = new int[n];
            // int ind = nums.length - 1;
            // for (int j = 0; j < i; j++)
            //   res[j] = nums[j];
            // for (int j = i; j< res.length; j++)
            //   res[j] = nums[ind--];
            // // System.out.println(Arrays.toString(nums));
            // System.arraycopy(res, 0, nums, 0, n);
            // System.out.println(Arrays.toString(res));
            int start =i;
            int end = nums.length - 1;
            int temp;
          
            while (start < end)
            {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        
    }
}