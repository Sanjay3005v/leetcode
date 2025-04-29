//4. Median of Two Sorted Arrays



/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    let i=nums1.length-1;
    let j=nums2.length-1;
    const nums = new Array(nums1.length+nums2.length);
    let k=nums.length-1;
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
        return nums[Math.floor(nums.length/2)];
    }
    else{
        return (nums[nums.length/2]+nums[(nums.length/2)-1])/2.0;
    }
};
