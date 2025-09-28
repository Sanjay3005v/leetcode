//1399. Count Largest Group


/**
 * @param {number} n
 * @return {number}
 */
var countLargestGroup = function (n) {
    let nums = new Array(37).fill(0);
    let maxSum = 0;
    for (let i = 1; i <= n; i++) {
        let sum = 0;
        let temp = i;
        while (temp > 0) {
            sum += temp % 10;
            temp = Math.floor(temp/10);
        }
        nums[sum]++;
        maxSum = Math.max(maxSum, nums[sum]);
    }
        let count = 0;
    for (let num of nums) {
        if (num === maxSum) {
            count++;
        }
    }
    return count;
};
