class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Interger, Interger> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            int n = nums.length/3;
            int number = nums[i];
            if(map.containsKey(number)){
                int oldCount = map.get(number);
                int newCount = oldCount + 1;
                map.put(number, newCount);
            }
        }
        for(int num : map.keySet()){
            int count = map.get(num);
            if(num > n){
                result.add(num);
            }
        }
        
    }
}