//1492. The kth Factor of n


class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        return list.size()<k? -1:list.get(k-1);
    }
}
