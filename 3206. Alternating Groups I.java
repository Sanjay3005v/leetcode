//3206. Alternating Groups I


class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        int n=colors.length;
        for(int i=0;i<n;i++){
            if(colors[i]!=colors[(i+1)%n] && colors[i]!=colors[(i-1+n)%n]){
                count++;
            }
        }
        return count;
    }
}
