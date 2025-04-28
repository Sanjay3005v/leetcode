//80. Remove Duplicates from Sorted Array II


/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if(nums.length<=2){
        return nums.length;
    }
    let i=0;
    for(let j=2;j<nums.length;j++){
        if(nums[i]!=nums[j]){
            nums[i+2]=nums[j];
            i++;
        }
    }
    return i+2;
};
