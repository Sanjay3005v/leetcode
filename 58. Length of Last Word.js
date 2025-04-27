//58. Length of Last Word


/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let length = 0;
    let i = s.length-1;
    while(s.charAt(i)==' '){
            i--;
        }
    while(i>=0){
        if(s.charAt(i)!=' '){
            i--;
            length++;
        }
        else{
            break;
        }
    }
    return length;
};
