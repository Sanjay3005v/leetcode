//3079. Find the Sum of Encrypted Integers


class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sol = 0;
        for(int num:nums){
            int temp = num;
            int dig=0;
            int max=0;
            while(num>0){
                max=Math.max(max,num%10);
                num/=10;
                dig=dig*10+1;
            }
            int sum=dig*max;
            max=0;
            sol+=sum;
        }
        return sol;
    }
}
