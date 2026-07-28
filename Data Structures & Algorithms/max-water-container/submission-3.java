class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int maxArea = 0;

        while(left<right){
            int width = right - left;
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            int waterHeight = Math.min(leftHeight, rightHeight);
            int currentArea =  waterHeight * width;

            if(currentArea > maxArea){
                maxArea = currentArea;
            }

            if(leftHeight < rightHeight){
                left++;
            }else{
                right--;
            }
        }
    return maxArea;
        
    }
}
