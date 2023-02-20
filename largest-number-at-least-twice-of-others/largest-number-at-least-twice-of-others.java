class Solution {
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length < 2) return -1;

		int len = nums.length;
		int maxIndex = 0;
		int max = 0;
		for (int i = 0; i < len; i++) {
			if (max < nums[i]) {
				max = nums[i];
				maxIndex = i;
			}
		}

		for (int val : nums) {
			if (max == val) continue;
			if (max < 2*val) return -1;
		}

		return maxIndex;
    }
}