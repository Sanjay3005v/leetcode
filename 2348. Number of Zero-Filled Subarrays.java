//2348. Number of Zero-Filled Subarrays


class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sol = 0;
        long sub = 0;
        for(int num :nums){
            if(num==0){
                sub+=1;
            }
            else{
                sub=0;
            }
            sol+=sub;
        }
        return sol;
    }
}
