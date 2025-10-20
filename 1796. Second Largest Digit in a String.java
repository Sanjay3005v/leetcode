//1796. Second Largest Digit in a String


class Solution {
    public int secondHighest(String s) {
        boolean max = false;
        for (char ch = '9'; ch >= '0'; ch--) {
            if (s.indexOf(ch) != -1) {
                if (max) {
                    return ch - '0';
                }
                max = true;
            }
        }
        return -1;
    }
}
