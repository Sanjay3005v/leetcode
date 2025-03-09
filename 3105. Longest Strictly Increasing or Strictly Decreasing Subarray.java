//3105. Longest Strictly Increasing or Strictly Decreasing Subarray


class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1;
        int dec=1;
        int sol=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                inc++;
                dec=1;
            }
            if(nums[i]>nums[i+1]){
                dec++;
                inc=1;
            }
            if(nums[i]==nums[i+1]){
                inc=1;
                dec=1;
            }
            sol=Math.max(sol,Math.max(inc,dec));
        }
        return sol;        
    }
}
