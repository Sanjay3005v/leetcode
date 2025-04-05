//1863. Sum of All Subset XOR Totals



class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum|=num;
        }
        return sum<<(nums.length-1);
    }
}
