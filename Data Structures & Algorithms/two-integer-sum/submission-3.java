class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> numberToIndex  = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int current = nums[i];
            int complement = target - current;
            boolean complementExists = numberToIndex.containsKey(complement);
            if(complementExists){
                int complemnentIndex = numberToIndex.get(complement);
                int currentIndex = i;
                int[] result = new int[2];
                result[0]= complemnentIndex;
                result[1]= currentIndex;
                return result;
            }
            numberToIndex.put(current,i);
        }

        int[] notFound = new int[2];
        notFound[0] = -1;
        notFound[1] = -1;
        return notFound;

    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,14};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("["+result[0] +", " + result[1] +"]");


    }
}

