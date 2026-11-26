class Solution {

    private int getNext(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (fast != 1 && getNext(fast) != 1) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));

            if (slow == fast) {
                return false;
            }
        }

        return true;
    }
}