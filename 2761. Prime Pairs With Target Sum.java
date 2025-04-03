//2761. Prime Pairs With Target Sum


class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] primes = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*i;j<n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            int j=n-i;
            if(!primes[i] && !primes[j] && i<=j){
                list.add(List.of(i,j));
            }
        }
        return list;
    }
}
