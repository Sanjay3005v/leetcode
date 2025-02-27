//7. Reverse Integer


import java.util.*;
class Solution {
    public int reverse(int n) {
        int x=Math.abs(n);
        long rev = 0;
        
		while(x!=0) {
			int r = x%10;
			x/=10;
			rev=r+(rev*10);
		}
        if(n<0){
            rev=-1*rev;
        }
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
            rev=0;
            return (int)rev;
        }
        return (int)rev;
    }
}
