class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> strs_map = new HashMap<>();

        for(String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            strs_map.putIfAbsent(sorted, new ArrayList<>());
            strs_map.get(sorted).add(s);
        }

        return new ArrayList<>(strs_map.values());
    
    }
}
