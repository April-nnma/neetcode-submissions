class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

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
        List<Integer> keys = new ArraryList<>(map.keySet()); //keys = [1;2;3]
        keys.sort((a,b) -> map.get(b) - map.get(a)); //keys = [3;2;1]

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = map.get(keys);
        }
    return result;    
    }
}
