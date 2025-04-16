//1922. Count Good Numbers


class Solution {
    public int countGoodNumbers(long n) {
        return (int)((multiply(5,(n+1)/2)*multiply(4,n/2))%1000000007);
    }
    public long multiply(int x,long y){
        long sol=1;
        long mul=x;
        while(y>0){
            if(y%2==1){
                sol=(sol*mul)%1000000007;
            }
            mul=(mul*mul)%1000000007;
            y/=2;
        }
        return sol;
    }
}
