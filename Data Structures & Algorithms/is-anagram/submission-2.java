class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s_data = new HashMap<>();
        HashMap<Character, Integer> t_data = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); ++i) {
            if (s_data.containsKey(s.charAt(i))) {
                s_data.put(s.charAt(i), s_data.get(s.charAt(i)) + 1);
            } else {
                s_data.put(s.charAt(i), 1);
            }
            if (t_data.containsKey(t.charAt(i))) {
                t_data.put(t.charAt(i), t_data.get(t.charAt(i)) + 1);
            }else {
                t_data.put(t.charAt(i), 1);
            }
        }
        System.out.println(s_data + " " + t_data);
        return s_data.equals(t_data);
    }
}
