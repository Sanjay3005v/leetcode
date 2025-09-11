//2566. Maximum Difference by Remapping a Digit


class Solution {
    public int minMaxDifference(int num) {
        String str = Integer.toString(num);
        String temp = Integer.toString(num);
        int i=0;
        while(i<str.length() && str.charAt(i)=='9'){
            i++;
        }
        if(i<str.length()){
            str=str.replace(str.charAt(i),'9');
        }
        temp=temp.replace(temp.charAt(0),'0');
        return Integer.parseInt(str)-Integer.parseInt(temp);
    }
}
