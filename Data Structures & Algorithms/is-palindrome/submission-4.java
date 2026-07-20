class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;

        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            while(left<right && !Character.isLetterOrDigit(leftChar)){
                left ++;
            }
            while(left<right && !Character.isLetterOrDigit(rightChar)){
                right --;
            }

            leftChar.toLowerCase();
            rightChar.toLowerCase();           

            if(leftChar != rightChar){
                return false;
            }
            
            left ++;
            right --; 
        }
    return true;
    }
   
}
