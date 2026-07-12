class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String word = strs[i];
            char[] letter = word.toCharArray();
            Arrays.sort(letter);
            String key = new String(letter);

            if(!map.containsKey(key)){
                List<String> group = new ArrayList<>();
                map.put(key, group);
            }
            List<String> group = map.get(key);
            group.add(word);
        }
        return new ArrayList<>(map.values());
    }
}
