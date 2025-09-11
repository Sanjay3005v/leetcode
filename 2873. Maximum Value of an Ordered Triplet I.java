//2873. Maximum Value of an Ordered Triplet I


class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxsol=0;
        long maxnum=0;
        long maxdiff=0;
        for(int i:nums){
            maxsol=Math.max(maxsol,maxdiff*i);
            maxdiff=Math.max(maxdiff,maxnum-i);
            maxnum=Math.max(maxnum,i);
        }
        return maxsol;
    }
}
