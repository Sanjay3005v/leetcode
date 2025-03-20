//238. Product of Array Except Self



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]
         sol = new int[nums.length];
        Arrays.fill(sol,1);
        int x=1;
        for(int i=0;i<nums.length;i++){
            sol[i]*=x;
            x*=nums[i];
        }
        x=1;
        for(int i=nums.length-1;i>=0;i--){
            sol[i]*=x;
            x*=nums[i];
        }
        return sol;
    }
}
