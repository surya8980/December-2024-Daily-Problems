class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int ind = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[ind]) {
                    ind = j;
                }
            }
            nums[ind] *= multiplier;
        }
        return nums;
    }
}
