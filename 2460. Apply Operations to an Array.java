//2460. Apply Operations to an Array


class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length-1;
        for(int i=0;i<n;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        n=nums.length;
        int[] arr = new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                arr[j]=nums[i];
                j++;
            }
        }
        return arr;
    }
}
