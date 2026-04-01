/**
 * @param {number} n
 * @return {boolean}
 */

// var isHappy = function(n) {
//     let seen = new Set();

//     while (!seen.has(n)) {
//         if (n === 1) return true;
//         seen.add(n);

//         n = n.toString()
//              .split('')
//              .reduce((sum, d) => sum + d * d, 0);
//     }

//     return false;
// };

var isHappy = function(n) {

    const getNext = (num) => {
        let sum = 0;
        while (num > 0) {
            let digit = num % 10;
            sum += digit * digit;
            num = Math.floor(num / 10);
        }
        return sum;
    };

    let slow = n;
    let fast = n;

    do {
        slow = getNext(slow);           // 1 step
        fast = getNext(getNext(fast));  // 2 steps
    } while (slow !== fast);

    return slow === 1;
};