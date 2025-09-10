//38. Count and Say



class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s= countAndSay(n-1);
        StringBuilder b = new StringBuilder();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(j<s.length() && s.charAt(j)==s.charAt(i)){
                j++;
            }
            b.append(j-i);
            b.append(s.charAt(i));
            i=j;
        }
        return b.toString();
    }
}
