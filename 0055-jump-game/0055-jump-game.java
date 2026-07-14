class Solution {
    public boolean canJump(int[] nums) {

        // Farthest index reachable so far
        int maxReach = 0;// this is the maximum reacheable index we can generate 

        for (int i = 0; i < nums.length; i++) {

            // Can't reach this index cuz 
            if (i > maxReach) {
                return false;
            }

            // Update the farthest reachable index
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        // Last index is reachable
        return true;
    }
}