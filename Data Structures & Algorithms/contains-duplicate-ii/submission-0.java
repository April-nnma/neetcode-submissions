class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(i>k){
                int oldIndex = i - k - 1;
                int oldNumber = nums[oldIndex];
                map.remove(oldNumber);
            }
            int current = nums[i];
            if(map.contains(current)){
                return true;
            }
            map.add(current);
        }
        return false;
    }
}