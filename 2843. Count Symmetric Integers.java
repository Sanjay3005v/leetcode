//2843. Count Symmetric Integers


class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String str = String.valueOf(i);
            if(str.length()%2==0){
                int mid = str.length()/2;
                int sum1=0;
                int sum2=0;
                for(int j=0;j<mid;j++){
                    sum1+=str.charAt(j);
                    sum2+=str.charAt(j+mid);
                }
                if(sum1==sum2){
                    count++;
                }
            }
        }
        return count;
    }
}
