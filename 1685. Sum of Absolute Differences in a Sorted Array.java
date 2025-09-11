//1685. Sum of Absolute Differences in a Sorted Array


class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum=0;
        for (int num:nums){
            sum+=num;
        }
        int prefixSum=0;
        int[] sol=new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            sum-=nums[i];
            sol[i]=Math.abs(prefixSum-(i*nums[i])) + Math.abs(sum-((nums.length-i-1)*nums[i]));
            prefixSum += nums[i];
        }
        return sol;
    }
}
