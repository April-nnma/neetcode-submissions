class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length -1;
        int boat = 0;

        while(left<=right){
            if(left==right){
                boat++;
                break;
            }
            int lightPerson = people[left];
            int heavyPerson = people[right];
            int totalWeight = lightPerson + heavyPerson;

            if(totalWeight <= limit){
                left++;
            }
            right--;
            boat++;
        }
    return boat;
    }
 
}