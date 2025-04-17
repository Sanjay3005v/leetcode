//35. Search Insert Position


/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let x=0;
    if(nums[nums.length-1]<target){
        return nums.length;
    }
    if(nums[0]>target){
        return 0;
    }
    for(let i=0;i<nums.length;i++){
        while(nums[i]<=target){
            if(nums[i]==target){
                x=i;
                break;
           }
           x=++i;
        }
    }
    return x;
};
