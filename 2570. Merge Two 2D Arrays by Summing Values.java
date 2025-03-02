//2570. Merge Two 2D Arrays by Summing Values


class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> num = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            num.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<nums2.length;i++){
            if(num.containsKey(nums2[i][0])){
                int sum = num.get(nums2[i][0])+nums2[i][1];
                num.put(nums2[i][0],sum);
            }
            else{
                num.put(nums2[i][0],nums2[i][1]);
            }
        }
        int[][] sol = new int[num.size()][2];
        List<Integer> key = new ArrayList<>(num.keySet());
        Collections.sort(key);
        int i=0;
        for(Integer j:key){
            sol[i][0] = j;
            sol[i][1] = num.get(j);
            i++;
        }
        return sol;
    }
}
