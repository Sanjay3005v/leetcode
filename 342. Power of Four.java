//342. Power of Four


class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0){
            return false;
        }
        while(n>0){
            if(n==1){
                return true;
            }
            if(n%4!=0){
                break;
            }
            n/=4;
        }
        return false;
    }
}
