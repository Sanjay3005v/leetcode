//2704. To Be Or Not To Be


/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe: function(val1){
            if(val1===val){
                return true;
            }
            else{
                throw new Error("Not Equal");
            }
        },
        notToBe: function(val2){
            if(val===val2){
                throw new Error("Equal");
            }
            else{
                return true;
            }
        }
    };
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */
