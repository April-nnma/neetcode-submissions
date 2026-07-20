class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<nums.length; i++){
            if(arr[i] == 0){
                count0++;
            }else if(arr[i] == 1){
                count1++;
            }else{
                count2++;
            }
        }
        int index = 0;
        for(int i = 0; i<count0; i++){
            arr[index] = 0;
            index++;
        }
         for(int i = 0; i<count0; i++){
            arr[index] = 0;
            index++;
        }
        
    }
}