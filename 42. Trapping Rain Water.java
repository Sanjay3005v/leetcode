//42. Trapping Rain Water


class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length -1;
        int lmax=0;
        int rmax=0;
        int sol=0;
        while(l<r){
            lmax=Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
            if(lmax<rmax){
                sol+=lmax-height[l];
                l++;
            }
            else{
                sol+=rmax-height[r];
                r--;
            }
        }
        return sol;
    }
}
