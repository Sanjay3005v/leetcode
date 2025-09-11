//290. Word Pattern


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        if (pattern.length() != words.length) {
            return false;
        }
        int i = 0;
        for (char ch : pattern.toCharArray()) {
            if (map.containsKey(ch)) {
                if (!(map.get(ch).equals(words[i]))) {
                    return false;
                }
            } else if (map.containsValue(words[i])) {
                return false;
            } else {
                map.put(ch, words[i]);
            }
            i++;
        }
        return true;
    }
}
