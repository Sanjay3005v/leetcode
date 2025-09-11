//1945. Sum of Digits of String After Convert


class Solution {
    public int getLucky(String s, int k) {
        int sol=0;
        StringBuilder str = new StringBuilder();
        for(char ch:s.toCharArray()){
            str.append((int)ch-'a'+1);
        }
        for(char ch:str.toString().toCharArray()){
            sol+=(ch-'0');
        }
        return sum(sol,k);
    }
    public int sum(int num,int k){
        if(--k==0){
            return num;
        }
        int sol = 0;
        while(num>0){
            sol+=num%10;
            num/=10;
        }
        return sum(sol,k);
    }
}
