//88. Merge Sorted Array


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length==0){
            nums1[0]=nums2[0];
        }
        else{
            int j=0,i=m;
            while(i<nums1.length){
                while(j<n){
                    nums1[i]=nums2[j];
                    j++;
                    i++;
                }
            }
            Arrays.sort(nums1);
        }
    }
}
