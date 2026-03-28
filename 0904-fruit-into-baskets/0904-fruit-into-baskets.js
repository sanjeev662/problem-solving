/**
 * @param {number[]} fruits
 * @return {number}
 */
var totalFruit = function(fruits) {
    let mp=new Map();
    let windowStart=0;
    let maxFruit=0;

    for(let i=0;i<fruits.length;i++){
        mp.set(fruits[i],(mp.get(fruits[i]) || 0)+1);

        while(mp.size>2){
            let fruit=fruits[windowStart];
            mp.set(fruit,(mp.get(fruit) || 0)-1);

            if(mp.get(fruit)==0)
            {
                mp.delete(fruit)
            }
            windowStart++;
        }
        maxFruit=Math.max(maxFruit,i-windowStart+1);
    }
    return maxFruit;
};