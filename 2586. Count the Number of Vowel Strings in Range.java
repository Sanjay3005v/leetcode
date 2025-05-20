//2586. Count the Number of Vowel Strings in Range


class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        Set<Character> set  = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        for(int i=left ;i<=right;i++){
            String word = words[i];
            if(set.contains(word.charAt(0)) && set.contains(word.charAt(word.length()-1))){
                count++;
            }
        }
        return count;
    }
}
