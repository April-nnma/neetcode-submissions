class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while(left<right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(leftChar != rightChar){
                boolean skipLeft = checkPalindrome(s, left + 1, right);
                boolean skipRight = checkPalindrome(s, left , right -1);
                if(skipLeft || skipRight){
                    return true;
                }else{
                    return false;
                }
            }
        left++;
        right --;
        }
        
    return true;
    }
    public boolean checkPalindrome(String s, int left, int right){
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