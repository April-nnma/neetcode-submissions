class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = nums.length + 1;
        for(int right = 0; right<nums.length; right++){
            sum += nums[right];
            while(sum>=target){
                int windowLength = right - left + 1;
                minLength = Math.min(minLength, windowLength);
                sum -=nums[left];
                left++;
            }
        }
        if(minLength == nums.length + 1){
            return 0;
        }
        return minLength;  
        
    }
}