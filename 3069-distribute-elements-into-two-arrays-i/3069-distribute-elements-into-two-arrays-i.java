class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        int n = nums.length;
        for(int i=2; i<n; i++){
            if(arr1.get(arr1.size()-1) > arr2.get(arr2.size()-1)) {
                arr1.add(nums[i]);
            }else {
                arr2.add(nums[i]);
            }
        }

        int res[] = new int[n];
        int i=0, k=0;
        while(i < arr1.size()){
            res[k++] = arr1.get(i++);
        }
        i=0;
        while(i < arr2.size()){
            res[k++] = arr2.get(i++);
        }

        return res;
    }
}