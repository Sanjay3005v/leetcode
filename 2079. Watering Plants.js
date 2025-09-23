//2079. Watering Plants


/**
 * @param {number[]} plants
 * @param {number} capacity
 * @return {number}
 */
var wateringPlants = function(plants, capacity) {
    let count=0;
    let temp = capacity;
    for(let i=0;i<plants.length;i++){
        if(capacity<plants[i]){
            count+=(i*2);
            capacity=temp;
        }
        capacity-=plants[i];
    }
    return count+plants.length;
};
