//2560. House Robber IV


class Solution {
    public int minCapability(int[] nums, int k) {
        int min=1;
        int max=Arrays.stream(nums).max().getAsInt();
        int n=nums.length;
        while(min<max){
            int mid=(min+max)/2;
            int count=0;
            for(int i=0;i<n;i++){
                if(nums[i]<=mid){
                    count++;
                    i++;
                }
            }
            if(count>=k) max=mid;
            else min=mid+1;
        }
        return min;
    }
}
