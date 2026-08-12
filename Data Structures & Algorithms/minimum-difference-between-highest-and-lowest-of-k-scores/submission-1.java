class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[k-1] - nums[0];
        for(int right = k; right < nums.length; right++){
            int left = right - k + 1;
            int current = nums[right] - nums[left];
            min = Math.min(current, min);
        }
        return min;
        
    }
}