//9. Palindrome Number



/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let rev = 0;
    let temp = x;
    while(x>0){
        rev = (rev*10)+x%10;
        x=Math.floor(x/10);
    }
    return rev===temp;
};
