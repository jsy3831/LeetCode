class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
		if(nums == null || n == 0) return 0;

		boolean isTwice = false;

		// used two-pointer technique.
		int writePointer = 1;

		for (int readPointer = 1; readPointer < n; readPointer++) {

			if (isTwice && nums[readPointer] != nums[readPointer - 1]) {
				nums[writePointer] = nums[readPointer];
				writePointer++;
				isTwice = false;
				continue;
			} else if (isTwice && nums[readPointer] == nums[readPointer - 1]) {
				continue;
			}

			if (!isTwice && nums[readPointer] == nums[readPointer - 1]) {
				isTwice = true;
				nums[writePointer] = nums[readPointer];
				writePointer++;
			} else if (!isTwice && nums[readPointer] != nums[readPointer - 1]) {
				nums[writePointer] = nums[readPointer];
				writePointer++;
			}

		}

		return writePointer;
    }
}