//80. Remove Duplicates from Sorted Array II


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int i=0;
        for(int j=2;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+2]=nums[j];
                i++;
            }
        }
        return i+2;
    }
}
