//213. House Robber II


class Solution {
    public int rob(int[] nums) {
        int max=0,sum=0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            int temp=Math.max(max,sum+nums[i]);
            sum=max;
            max=temp;
        }
        int max2=0,sum2=0;
        for(int i=1;i<nums.length;i++){
            int temp=Math.max(max2,sum2+nums[i]);
            sum2=max2;
            max2=temp;
        }
        return Math.max(max,max2);
    }
}
