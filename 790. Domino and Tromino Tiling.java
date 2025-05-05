//790. Domino and Tromino Tiling


class Solution {
    public int numTilings(int n) {
        long a = 1;
        long b = 2;
        long c = 5;
        long mod = 1000000007;
        if(n == 1){
            return (int)a;
        }
        if(n == 2){
            return (int)b;
        }
        if(n == 0){
            return 0; 
        }
        for(int i = 4 ; i <= n ;i++){
            long k = ((c*2) + a)%mod;
            a = b;
            b = c;
            c = k;            
        }
        return (int)c;
    }
}
