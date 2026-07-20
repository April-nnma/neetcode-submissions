class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> frequency = new HashMap<>();
        for(char Character : s.toCharArray()){
            int count = frequency.getOrDefault(Character, 0);
            frequency.put(Character, count +1);
        }
        for(char Character : t.toCharArray()){
            int count = frequency.getOrDefault(Character, 0);
            frequency.put(Character, count -1);
        }
        for(int count : frequency.Value()){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

}
