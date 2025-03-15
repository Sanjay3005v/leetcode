//198. House Robber


class Solution {
    public int rob(int[] nums) {
        int max=0,sum=0;
        for(int i:nums){
            int temp=Math.max(max,sum+i);
            sum=max;
            max=temp;
        }
        return max;
    }
}
