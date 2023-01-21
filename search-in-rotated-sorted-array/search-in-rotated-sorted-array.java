class Solution {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length-1, target);
    }
    
    private int search(int[] nums, int l, int r, int target) {
        if (l > r) return -1;
        int mid = l + (r-l)/2;
        if (nums[mid] == target) return mid;
        if (nums[l] == target) return l;
        if (nums[r] == target) return r;
        if (nums[l] < nums[mid]) { // => nums[mid] > nums[r]
            if (target > nums[l] && target < nums[mid]) {
                return search(nums, l+1, mid, target);
            } else {
                return search(nums, mid+1, r-1, target);
            }
        } else { // nums[l] > nums[mid] => nums[mid] < nums[r]
            if (target > nums[mid] && target < nums[r]) {
                return search(nums, mid+1, r-1, target);
            } else {
                return search(nums, l+1, mid, target);
            }
        }
    }
}