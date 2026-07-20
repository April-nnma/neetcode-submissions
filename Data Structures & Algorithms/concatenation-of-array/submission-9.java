class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];

        for(int i = 0; i<n; i ++){
            int current = nums[i];
             int indexFirst = n;
             int indexSecond = n + i; 

             ans[indexFirst] = current;
             ans[indexSecond] = current; 
        }
        return ans;
    }
}    