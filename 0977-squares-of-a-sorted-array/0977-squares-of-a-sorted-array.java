class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
			double sqrt = Math.pow(nums[i], 2);
			int val = (int)sqrt;
			nums[i] = val;
		}

		Arrays.sort(nums);

		return nums;
    }
}