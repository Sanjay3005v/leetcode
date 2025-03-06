//2079. Watering Plants


class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int temp = capacity;
        for(int i=0;i<plants.length;i++){
            if(capacity<plants[i]){
                count+=(i*2);
                capacity=temp;
            }
            capacity-=plants[i];
        }
        return count+plants.length;
    }
}
