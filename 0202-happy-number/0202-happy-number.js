/**
 * @param {number} n
 * @return {boolean}
 */

var isHappy = function(n) {
    let seen = new Set();

    while (!seen.has(n)) {
        if (n === 1) return true;
        seen.add(n);

        n = n.toString()
             .split('')
             .reduce((sum, d) => sum + d * d, 0);
    }

    return false;
};