//3005. Count Elements With Maximum Frequency


/**
 * @param {number[]} nums
 * @return {number}
 */
var maxFrequencyElements = function(nums) {
    let freq = new Array(101).fill(0);
    let max = 0, res = 0;
    for (let i=0;i<nums.length;i++) {
        let f = ++freq[nums[i]];
        if (f > max) {
            max = f;
            res = f;
        } else if (f === max) 
            res += f;
    }
    return res;
};
