//1518. Water Bottles


/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var numWaterBottles = function(numBottles, numExchange) {
    return Math.floor(numBottles+(numBottles-1)/(numExchange-1));
};
