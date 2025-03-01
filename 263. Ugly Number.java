//263. Ugly Number


class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        int[] factors= {2,3,5};
        for(int i:factors){
            while(n%i==0){
                n/=i;
            }
        }
        if(n==1){
            return true;
        }
        return false;
    }
}
