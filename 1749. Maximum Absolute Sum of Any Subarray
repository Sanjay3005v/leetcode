//1749. Maximum Absolute Sum of Any Subarray


class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=0,min=0;
        int sum=0;

        for(int i:nums){
            sum+=i;
            max=Math.max(max,sum);
            min=Math.min(min,sum);
        }
        return max-min;
    }
}
