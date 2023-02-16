class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null) return -1;
		
		int len = nums.length;
		int[] sumLeft = new int[len];
		int[] sumRight = new int[len];

		int sum = 0;
		for (int i = 0; i < len; i++) {
			sumLeft[i] = sum;
			sum += nums[i];
		}

		sum = 0;
		for (int i = len - 1; i >= 0; i--) {
			sumRight[i] = sum;
			sum += nums[i];
		}

		for (int i = 0; i < len; i++) {
			if (sumLeft[i] == sumRight[i]) return i;
		}

		return -1;
    }
}