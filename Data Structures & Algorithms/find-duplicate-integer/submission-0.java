class Solution {
    public int findDuplicate(int[] nums) {
        // Step 1: Put both runners at the starting line
        int slow = nums[0];
        int fast = nums[0];

        // Let them run until they crash into each other inside the loop
        do {
            slow = nums[slow];          // Tortoise takes 1 step
            fast = nums[nums[fast]];    // Hare takes 2 steps
        } while (slow != fast);

        // Step 2: Reset Tortoise to the start
        slow = nums[0];

        // Both walk at the SAME speed (1 step) until they meet at the entrance
        while (slow != fast) {
            slow = nums[slow];          // 1 step
            fast = nums[fast];          // 1 step
        }

        // The meeting point is the duplicate number
        return slow;
    }
}