class Solution {
      public static String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i<word1.length() && j<word2.length()){
            char firstChar = word1.charAt(i);
            builder.append(firstChar);
            i++;

            char secondChar = word2.charAt(j);
            builder.append(secondChar);
            j++;
        }
        while(i<word1.length()){
            char firstChar = word1.charAt(i);
            builder.append(firstChar);
            i++;
        }
        while(j<word2.length()){
            char secondChar = word2.charAt(j);
            builder.append(secondChar);
            j++;
        }
        return builder.toString();

    }
}