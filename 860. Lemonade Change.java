//860. Lemonade Change


class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives=0,tens=0;
        for(int i:bills){
            if(i==5){
                fives++;
            }
            else if(i==10){
                if(fives>0){
                    fives--;
                    tens++;
                }
                else{
                    return false;
                }
            }
            else{
                if(fives>0 && tens>0){
                    fives--;
                    tens--;
                }
                else if(fives>2){
                    fives-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
