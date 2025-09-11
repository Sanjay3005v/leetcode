//3498. Reverse Degree of a String


class Solution {
    public int reverseDegree(String s) {
        int prod=1;
        for(int i=0;i<s.length();i++){
            int rev=26-(s.charAt(i)-'a');
            prod+=rev*(i+1);
            System.out.println(prod);
        }
        return prod-1;
    }
}
