//899. Orderly Queue

class Solution {
    public String orderlyQueue(String s, int k) {
        String str = s;
        String temp = s;
        if(s.length()==1){
            return s;
        }
        if (k == 1) {
            for (int i = 0; i < s.length(); i++) {
                temp = temp.substring(1) + temp.charAt(0);
                System.out.println(temp);
                if (temp.compareTo(str) < 0) {
                    str = temp;
                }
            }
            return str;
        }
        String sol="";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for (char c : ch) {
            sol += c;
        }
        return sol;
    }
}
