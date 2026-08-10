class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0;
        long product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left++];
            }

            // Every subarray ending at 'right' and starting
            // anywhere from left to right is valid.
            count += right - left + 1;
        }

        return count;
    }
}