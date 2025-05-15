//2900. Longest Unequal Adjacent Groups Subsequence I


class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> sol = new ArrayList<>();
        sol.add(words[0]);
        for(int i=1;i<groups.length;++i){
            if(groups[i]!=groups[i-1]){
                sol.add(words[i]);
            }
        }
        return sol;
    }
}
