//58. Length of Last Word


class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length()-1;
        while(s.charAt(i)==' '){
                i--;
            }
        while(i>=0){
            if(s.charAt(i)!=' '){
                i--;
                length++;
            }
            else{
                break;
            }
        }
        return length;
    }
}
