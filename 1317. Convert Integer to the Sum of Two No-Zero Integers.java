//1317. Convert Integer to the Sum of Two No-Zero Integers


class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<=n/2;i++){
            if(!String.valueOf(n-i).contains("0") && !String.valueOf(i).contains("0")){
                return new int[]{i,n-i};
            }
        }
        return new int[2];
    }
}
