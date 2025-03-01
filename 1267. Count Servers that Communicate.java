//1267. Count Servers that Communicate



class Solution {
    public int countServers(int[][] a) {
        int count =0;
        int iso=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==1){
                    count++;
                }
            }
        }
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==1){
                    int x=0;
                    for(int k=0;k<a[0].length;k++){
                        if(a[i][k]==1){
                            x++;
                        }
                    }
                    for(int l=0;l<a.length;l++){
                        if(a[l][j]==1){
                            x++;
                        }
                    }
                    if(x==2){
                       iso++;
                    }
                }
            }
        }
        return count-iso;
    }
}
