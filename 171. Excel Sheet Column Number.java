//171. Excel Sheet Column Number


class Solution {
    public int titleToNumber(String columnTitle) {
        int count=0;
        for(char ch:columnTitle.toCharArray()){
            count=(count*26)+ch-64;
        }
        return count;
    }
}
