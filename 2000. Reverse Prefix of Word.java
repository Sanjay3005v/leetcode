//2000. Reverse Prefix of Word


class Solution {
    public String reversePrefix(String word, char ch) {
        char[] c = word.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<c.length;i++){
            if(c[i]==ch){
                String str1 = word.substring(0,i+1);
                String str2 = word.substring(i+1);
                str.append(str1);
                str.reverse();
                str.append(str2);
                break;
            }
        }
        if(str.isEmpty()){
            return word;
        }
        return str.toString();
    }
}
