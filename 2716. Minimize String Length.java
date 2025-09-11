//2716. Minimize String Length


class Solution {
    public int minimizedStringLength(String s) {
        int[] arr = new int[26];
        int count=0;
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        for(int num:arr){
            if(num>0){
                count++;
            }
        }
        return count;
    }
}
