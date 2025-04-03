//2874. Maximum Value of an Ordered Triplet II


class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxnum=0,maxsol=0,maxdiff=0;
        for(int i:nums){
            maxsol=Math.max(maxsol,maxdiff*i);
            maxdiff=Math.max(maxdiff,maxnum-i);
            maxnum=Math.max(maxnum,i);
        }
        return maxsol;
    }
}
