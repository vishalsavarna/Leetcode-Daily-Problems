//330. Patching Array

class Solution {
    public int minPatches(int[] nums, int n) {
        //Taken help from solution to get the code
        //Taken help from chatGPT to get the next level of understanding
        long miss = 1;  // Smallest sum we can't form
        int result = 0; // Number of patches added
        int i = 0;      // Index to iterate through nums

        while (miss <= n) { // Loop until we can form sums up to n
            if (i < nums.length && nums[i] <= miss) {
                // If the current number in nums can help form the sum 'miss'
                miss += nums[i]; // Include nums[i] in the sum
                i++;             // Move to the next element in nums
            } else {
                // If nums[i] is too large to help form the sum 'miss'
                miss += miss; // Add 'miss' itself to the sums (patching)
                result++;     // Increment the patch count
            }
        }

        return result; // Return the number of patches added
    }
}
