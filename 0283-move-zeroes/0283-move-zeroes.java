class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
		if (nums == null || n < 2) return;

		int writePointer = 0;
		int zeroCounter = 0;

		for (int readPointer = 0; readPointer < n; readPointer++) {
			if (nums[readPointer] != 0) {
				nums[writePointer] = nums[readPointer];
				writePointer++;
			} else {
				zeroCounter++;
			}
		}

		while(zeroCounter != 0) {
			n--;
			nums[n] = 0;
			zeroCounter--;
		}
    }
}