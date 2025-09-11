//3305. Count of Substrings Containing Every Vowel and K Consonants I

class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private int atLeastK(String word, int k) {
        int n = word.length();
        int count = 0;
        int cons= 0;
        int left = 0;
        HashMap<Character, Integer> vow = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = word.charAt(right);
            if (isVowel(c)) {
                vow.put(c, vow.getOrDefault(c, 0) + 1);
            } else {
                cons++;
            }

            while (vow.size() == 5 && cons >= k) {
                count += n - right;
                char ch = word.charAt(left);
                if (isVowel(ch)) {
                    vow.put(ch, vow.get(ch) - 1);
                    if (vow.get(ch) == 0) {
                        vow.remove(ch);
                    }
                } else {
                    cons--;
                }
                left++;
            }
        }
        return count;
    }
    public int countOfSubstrings(String word, int k) {
        return atLeastK(word, k) - atLeastK(word, k + 1);        
    }
}
