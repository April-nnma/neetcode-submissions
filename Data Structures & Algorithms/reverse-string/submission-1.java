class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        while(left < right){
            char temp = s[left];
            s[right] = s[left];
            s[right] = temp;
            left ++;
            right --;
        }
    }
}