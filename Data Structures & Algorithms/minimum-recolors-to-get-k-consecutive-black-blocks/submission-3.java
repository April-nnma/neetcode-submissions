class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteCount = 0;
        for(int i = 0; i < k; i++){
            char current = blocks.charAt(i);
            if(current == 'W'){
                whiteCount++;
            }
        }
        int minRecolor = whiteCount;
        for(int right = k; right<blocks.length(); right++){
            char enter = blocks.charAt(right);
            char leave = blocks.charAt(right - k);
            if(enter == 'W'){
                whiteCount++;
            }
            if(leave == 'W'){
                whiteCount--;
            }
            minRecolor = Math.min(minRecolor, whiteCount);
        }
        return minRecolor;
    }
}