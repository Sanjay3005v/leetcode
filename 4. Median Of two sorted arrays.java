//4. Median Of two sorted arrays



class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=nums1.length-1;
        int j=nums2.length-1;
        int[] nums = new int[nums1.length+nums2.length];
        int k=nums.length-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums[k--]=nums1[i--];
            }
            else{
                nums[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums[k--]=nums2[j--];
        }
        while(i>=0){
            nums[k--]=nums1[i--];
        }
        if(nums.length%2==1){
            return (double)nums[nums.length/2];
        }
        else{
            return (nums[nums.length/2]+nums[(nums.length/2)-1])/2.0;
        }
    }
}
