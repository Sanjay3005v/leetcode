//3232. Find if Digit Game Can Be Won


class Solution {
    public boolean canAliceWin(int[] nums) {
        int dig1 = 0;
        int dig2 = 0;
        for(int num:nums){
            if(num<10){
                dig1+=num;
            }
            else{
                dig2+=num;
            }
        }
        return dig1!=dig2;
    }
}
