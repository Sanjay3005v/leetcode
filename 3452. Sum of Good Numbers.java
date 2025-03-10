//3452. Sum of Good Numbers


class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(((i-k)>=0?nums[i-k]<nums[i]:true) && ((i+k)<=nums.length-1?nums[i+k]<nums[i]:true)){
                sum+=nums[i];
            }
        }
        return sum;
    }
}
