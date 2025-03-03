//2161. Partition Array According to Given Pivot



class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] sol = new int[nums.length];
        int x=0;
        for(int i:nums){
            if(i<pivot){
                sol[x]=i;
                x++; 
            }
        }
        for(int i:nums){
            if(i==pivot){
                sol[x]=i;
                x++;
            }
        }
        for(int i:nums){
            if(i>pivot){
                sol[x]=i;
                x++;
            }
        }
        return sol;
    }
}
