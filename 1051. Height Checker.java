//1051. Height Checker


class Solution {
    public int heightChecker(int[] heights) {
        int[] nums = heights.clone();
        Arrays.sort(nums);
        int count=0;
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}
