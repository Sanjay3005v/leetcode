//151. Reverse Words in a String

class Solution {
    public String reverseWords(String s) {
        String rev = "";
        s=s.trim();
        String[] words = s.split("\\s+");
		for( int i=words.length-1;i>=0;i--) {
			rev+=words[i];
            if(i!=0){
                rev+=" ";
            }
		}
        return rev;
    }
}
