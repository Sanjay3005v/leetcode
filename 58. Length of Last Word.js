//58. Length of Last Word


/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let words =s.trim().split(" ");
    let word = words[words.length-1];
    return word.length;
};
