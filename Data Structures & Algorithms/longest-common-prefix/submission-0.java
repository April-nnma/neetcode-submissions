class Solution {
    public String longestCommonPrefix(String[] strs) {
        
    String firstWord = strs[0];
        for (int i = 0; i < firstWord.length(); i++){
            char firstChar = firstWord.charAt(i); //tạo ra ký tự đầu tiên
            for(int j = 1; j <strs.length; j++){
                String currentWord = strs[j];
                if(i >= currentWord.length()){ //i=3 3>=3
                    return firstWord.substring(0,i);
                }
                char currentChar = currentWord.charAt(i);
                if(currentChar != firstChar){ //n khac t
                    return firstWord.substring(0,i);
                }
            }
        }
        return firstWord;
    }
}