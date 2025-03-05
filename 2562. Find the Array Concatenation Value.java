//2562. Find the Array Concatenation Value


class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sol = 0;
        for(int i=0,j=nums.length-1;i<=j;i++,j--){
            if(i==j){
                sol+=nums[i];
            }
            else{
                long temp = Long.parseLong(nums[i]+""+nums[j]);
                sol+=temp;
            }
        }
        return sol;
    }
}
