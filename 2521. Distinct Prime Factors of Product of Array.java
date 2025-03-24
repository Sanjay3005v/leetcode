//2521. Distinct Prime Factors of Product of Array


class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> factors = new HashSet<>();
        for(int num:nums){
            for(int i=2;i<=Math.sqrt(num);i++){
                while(num%i==0){
                    factors.add(i);
                    num/=i;
                }
            }
            if(num>1){
                factors.add(num);
            }
        }
        return factors.size();
    }
}
