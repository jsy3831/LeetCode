class Solution {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length % 2 != 0) return 0;
		
		Arrays.sort(nums);
		int result = 0;
		int i = 0;
		int j = 1;

		while (j < nums.length) {
			result += Math.min(nums[i], nums[j]);
			i += 2;
			j += 2;
		}
		
		return result;
    }
}