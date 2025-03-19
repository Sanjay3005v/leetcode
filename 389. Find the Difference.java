//389. Find the Difference


class Solution {
    public char findTheDifference(String s, String t) {
        int count=0;
        for(int i:s.toCharArray()){
            count-=i;
        }
        for(int i:t.toCharArray()){
            count+=i;
        }
        return (char)count;
    }
}
