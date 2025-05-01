//55. Jump Game


/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    let a = 0;
        for (let i = 0; i < nums.length; i++) {
            if (i > a){
                return false;
            }
            a = Math.max(a, i + nums[i]);
            if (a >= nums.length - 1){
                return true;
            } 
        }
        return false;
};
