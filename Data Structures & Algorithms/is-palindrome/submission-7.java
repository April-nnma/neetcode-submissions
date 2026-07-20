class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;

        while(left < right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }
            char leftChar =  leftChar.toLowerCase(s.charAt(left));
            char rightChar = rightChar.toLowerCase(s.charAt(right)); 
           
            if(leftChar != rightChar){
                return false;
            }
            
            left ++;
            right --; 
        }
    return true;
    }
   
}
