//4. Median Of two sorted arrays
import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a=new int[nums1.length+nums2.length];
        int k=0;
        for(int i:nums1){
            a[k]=i;
            k++;
        }
        for(int j:nums2){
            a[k]=j;
            k++;
        }
        Arrays.sort(a);
        if(a.length%2!=0){
            double x=a[a.length/2];
            return x;
        }
        else{
            double x1=a[a.length/2];
            double x2=a[(a.length/2)-1];
            double x=(x1+x2)/2;
            return x;
        }
    }
}
