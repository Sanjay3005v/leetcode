//2843. Count Symmetric Integers


/**
 * @param {number} low
 * @param {number} high
 * @return {number}
 */
var countSymmetricIntegers = function(low, high) {
    let count=0;
    for(let i=low;i<=high;i++){
        let str = String(i);
        if(str.length%2===0){
            let mid = str.length/2;
            let sum1=0;
            let sum2=0;
            for(let j=0;j<mid;j++){
                sum1+=parseInt(str.charAt(j));
                sum2+=parseInt(str.charAt(j+mid));
                }
                if(sum1===sum2){
                    count++;
                }
            }
        }
        return count;
};
