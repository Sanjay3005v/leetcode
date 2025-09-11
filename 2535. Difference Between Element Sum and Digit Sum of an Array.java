2535. Difference Between Element Sum and Digit Sum of an Array//


class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int dig = 0;
        for(int num:nums){
            sum+=num;
            while(num>0){
                dig+=num%10;
                num/=10;
            }
        }
        return Math.abs(sum-dig);
    }
}
