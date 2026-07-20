class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;

        while(left<right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(leftChar != rightChar){
                return false;
            }
            
            left ++;
            right --; 
        }
    return true;    
    }
}
