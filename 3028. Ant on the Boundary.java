//3028. Ant on the Boundary


class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count=0;
        int tot = 0;
        for(int i:nums){
            tot+=i;
            if(tot==0){
                count++;
            }
        }
        return count;
    }
}
