//171. Excel Sheet Column Number


/**
 * @param {string} columnTitle
 * @return {number}
 */
var titleToNumber = function(columnTitle) {
    let count=0;
    for(let i=0;i<columnTitle.length;i++){
        count=(count*26)+columnTitle.charCodeAt(i)-64;
    }
    return count;
};
