//1323. Maximum 69 Number


class Solution {
    public int maximum69Number (int num) {
        int sol=0;
        char[] digs = String.valueOf(num).toCharArray();
        for(int i=0;i<digs.length;i++){
            if(digs[i]=='6'){
                digs[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(digs));
    }
}
