//3136. Valid Word


class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean spl = true;
        boolean vow = false;
        boolean con = false;
        for(char ch:word.toLowerCase().toCharArray()){
             if(ch>='a'&&ch<='z'){
                if(isVowel(ch)){
                    vow=true;
                }
                else{
                    con=true;
                }
            }
            else if(isSpl(ch)){
                spl=false;
            }
            if(!spl){
                return false;
            }
        }
        return spl&&vow&&con;
    }
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public boolean isSpl(char ch){
        return ch=='@'||ch=='#'||ch=='$';
    }
}
