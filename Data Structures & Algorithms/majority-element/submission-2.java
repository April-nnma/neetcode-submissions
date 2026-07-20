class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int current = nums[i];
            int count;
            if(frequency.containsKey(current)){
                int oldCount = frequency.get(current);
                count = oldCound + 1;
            }else{
                count = 1;
            }
            frequency.put(current, count);
            int n = nums.length/2;
            if(count>n){
                return current;
            }
        }
        return -1;
    }
}