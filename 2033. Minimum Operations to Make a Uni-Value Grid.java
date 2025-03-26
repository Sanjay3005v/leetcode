//2033. Minimum Operations to Make a Uni-Value Grid



class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();
        for(int[] i:grid){
            for(int j:i){
                list.add(j);
            }
        }
        Collections.sort(list);
        int mid = list.get(list.size()/2);
        int count=0;
        for(int nums:list){
            if(nums%x!=mid%x){
                return -1;
            }
            count+=Math.abs(mid-nums)/x;
        }
        return count; 
    }
}
