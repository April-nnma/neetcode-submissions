class Solution {
    public String longestCommonPrefix(String[] strs) {
    
    String firstWord = strs[0];
        for (int i = 0; i < firstWord.length(); i++){
            char firstChar = firstWord.charAt(i);
            for(int j = 1; j <strs.length; j++){
                String currentWord = strs[j];
                if(i >= currentWord.length()){ 
                    return firstWord.substring(0,i);
                }
                char currentChar = currentWord.charAt(i);
                if(currentChar != firstChar){
                    return firstWord.substring(0,i);
                }
            }
        }
        return firstWord;
    }
}