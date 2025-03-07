//2523. Closest Prime Numbers in Range


class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] primes = new boolean[right+1];
        primes[0]=primes[1]=true;
        for(int i=2;i*i<=primes.length;i++){
            for(int j=i*i;j<primes.length;j+=i){
                if(primes[i]==false){
                    primes[j]=true;
                }
                
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<right+1;i++){
            if(!primes[i]){
                list.add(i);
            }
        }
        int[] sol = {-1,-1};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            int dist = list.get(i+1)-list.get(i);
            if(dist<min){
                sol[0]=list.get(i);
                sol[1]=list.get(i+1);
                min=dist;
            }
        }
        return sol;
    }
}
