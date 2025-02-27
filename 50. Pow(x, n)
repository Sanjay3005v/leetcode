//50. Pow(x, n)


class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1; 
        } 
        if(n<0){
            n = -n ; 
            x = 1/x ; 
            return x*myPow(x,n-1);
        }
        double sol = myPow(x,n/2);
        if(n%2==0) {
            return sol*sol;
        }
        return x*sol*sol;
    }
}
