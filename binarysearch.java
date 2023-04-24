class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high) { // while it hasn't reached the last element
            int mid = (low + high) / 2; // set middle element
            int guess = nums[mid]; // make guess = current mid
            if (guess == target) {
                return mid; // found
            } else if (guess < target) { // if guess was too small
                low = mid + 1; //  increase low to guess higher
            } else { // if guess was too high
                high = mid - 1; // decrease high to guess lower
            }
        }
        return -1; // not found
    }
}