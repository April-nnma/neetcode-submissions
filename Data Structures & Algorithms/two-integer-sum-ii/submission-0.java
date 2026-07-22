class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;

        while(left<right){
            int leftNum = numbers[left];
            int rightNum = numbers[right];
            int sum = leftNum + rightNum;

            if(sum==target){
                int leftPosition = left + 1;
                int rightPosition = right + 1;
                int[] result = new int[2];
                result[0] = leftPosition;
                result[1] = rightPosition;

                return result;
            }
            if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
}
