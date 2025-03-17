//1295. Find Numbers with Even Number of Digits


class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            int digits=0;
            while(i>0){
                digits++;
                i/=10;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}
