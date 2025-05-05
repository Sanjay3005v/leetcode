//790. Domino and Tromino Tiling


/**
 * @param {number} n
 * @return {number}
 */
var numTilings = function(n) {
    let a = 1;
    let b = 2;
    let c = 5;
    let mod = 1000000007;
    if(n == 1){
        return a;
    }
    if(n == 2){
        return b;
    }
    if(n == 0){
        return 0; 
    }
    for(let i = 4 ; i <= n ;i++){
        let k = ((c*2) + a)%mod;
        a = b;
        b = c;
        c = k;            
    }
    return c;

};
