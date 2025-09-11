//3169. Count Days Without Meetings


class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b) -> Integer.compare(a[0],b[0]));
        int count=0;
        int end=0;
        for(int[] meeting:meetings){
            if(meeting[0]>end){
                count+=meeting[0]-end-1;
            }
            end= Math.max(end,meeting[1]);
        }
        if(days>end){
            count+=days-end;
        }
        return count;
    }
}
