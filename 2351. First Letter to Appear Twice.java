//2351. First Letter to Appear Twice


class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
            if(arr[ch-'a']>1){
                return ch;
            }
        }
        return 'a';
    }
}
