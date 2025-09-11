//3622. Check Divisibility by Digit Sum and Product


class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int temp=n;
        while(n>0){
            sum+=n%10;
            prod*=n%10;
            n/=10;
        }
        return temp%(sum+prod)==0;
    }
}
