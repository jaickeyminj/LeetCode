class Solution {
//     public int trap(int[] height) {
//         int n = height.length;
        
//         int[] rightMax = new int[n];
//         rightMax[n-1] = 0;
//         for(int i = n-2; i >= 0; i--){
//             rightMax[i] = Math.max(rightMax[i+1], height[i+1]);
//         }
        
//         int leftMax = 0;
//         int water = 0;
//         for(int i = 0; i < n; i++){
//             int curWater = Math.min(leftMax, rightMax[i]) - height[i];
//             if(curWater > 0) water += curWater;
//             leftMax = Math.max(leftMax, height[i]);
//         }
//         return water;
//     }
    
   public int trap(int[] height) {
	    // add your logic here
		int res =0;
        
        int a[] = new int[height.length];
        int b[] = new int[a.length];
        int max = height[0];
        // a[0]= max;
        for(int i=0;i<a.length;i++){
            max = Math.max(height[i],max);
            a[i]= max;
        // System.out.println(max+" "+height[i]);
        }
        // b[height.length-1]= height[height.length-1];
        max = b[height.length-1];
        for(int i= height.length-1;i>=0;i--){
            max= Math.max(max,height[i]);
            b[i]=max;// = Math.max(max,height[i]);
        }
//         System.out.println(Arrays.toString(a));
        
//         System.out.println(Arrays.toString(b));
        int j=0;
        for(int i: height){
            res += Math.min(a[j],b[j])- i;
            // System.out.print(res+"=#");
            j+=1;
        }
        return res;
	}
}