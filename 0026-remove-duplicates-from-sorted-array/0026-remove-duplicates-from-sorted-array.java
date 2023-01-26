class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

		int result = 1;
		int dump = nums[0];

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] != dump) {
				dump = nums[i];
				nums[result] = dump;

				result++;
			}
		}

		return result;
    }
}