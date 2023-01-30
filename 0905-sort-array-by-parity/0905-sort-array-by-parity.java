class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
		if (nums == null || n < 2) return nums;

		int writePointer = 0;
		int swap = 0;
		for (int readPointer = 0; readPointer < n; readPointer++) {
			if (nums[readPointer] % 2 == 0) {
				swap = nums[writePointer];
				nums[writePointer] = nums[readPointer];
				nums[readPointer] = swap;
				writePointer++;
			}
		}

		return nums;
    }
}