//1941. Check if All Characters Have Equal Number of Occurrences


class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        int count=0;
        for(char ch:s.toCharArray()){
            count=++freq[ch-'a'];
        }
        for(int num:freq){
            if(num>0 && count!=num){
                return false;
            }

          
        }
        return true;
    }
}
