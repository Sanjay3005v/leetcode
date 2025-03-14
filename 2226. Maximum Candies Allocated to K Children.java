//2226. Maximum Candies Allocated to K Children


class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=0;
        for(int i:candies){
            max=Math.max(i,max);
        }
        int left=0,right=max;
        while(left<right){
            int mid=(left+right+1)/2;
            if(canAllocate(candies,k,mid)){
                left=mid;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }
    private boolean canAllocate(int[] candies,long k,int mid){
        long allocate=0;
        for(int i:candies){
            allocate+=i/mid;
        }
        return allocate>=k;
    }
}
