//2469. Convert the Temperature


/**
 * @param {number} celsius
 * @return {number[]}
 */
var convertTemperature = function (celsius) {
    let sol = new Array(2).fill(0);
    sol[0] = celsius + 273.15;
    sol[1] = (celsius * 1.80) + 32;
    return sol;
};
