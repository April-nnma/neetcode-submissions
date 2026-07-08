class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int n = nums.length/3;
        for(int i = 0; i<nums.length; i++){
            int number = nums[i];
            if(map.containsKey(number)){
                int oldCount = map.get(number);
                int newCount = oldCount + 1;
                map.put(number, newCount);
            }else{
                map.put(number, 1);
            }
        }
        for(int number : map.keySet()){
            int count = map.get(number);
            if(count > n){
                result.add(number);
            }
        }
        return result;
    }
}