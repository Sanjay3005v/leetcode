//2185. Counting Words With a Given Prefix


class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String str:words){
            if(str.length()>=pref.length() && str.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
