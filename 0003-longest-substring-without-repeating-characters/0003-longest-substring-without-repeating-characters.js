/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let mp=new Map();
    let start=0;
    let maxLength=0;

    for(let i=0;i<s.length;i++){
        mp.set(s[i],(mp.get(s[i]) || 0)+1);

        while(mp.get(s[i]) > 1){
            let startchar = s[start];
            mp.set(startchar,(mp.get(startchar)||0)-1);

            if(mp.get(startchar)==0){
                mp.delete(startchar);
            }
            start++;
        }
        maxLength=Math.max(maxLength,i-start+1);
    }
    return maxLength;
};