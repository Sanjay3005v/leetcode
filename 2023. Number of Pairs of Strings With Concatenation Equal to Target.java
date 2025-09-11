//2023. Number of Pairs of Strings With Concatenation Equal to Target


class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j!=i && target.equals(nums[i]+nums[j])){
                    count++;
                }
            }
        }
        return count;
    }
}
