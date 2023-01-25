class Solution {
    public int removeElement(int[] nums, int val) {
        int result = 0;
		if (nums == null || nums.length == 0) return result;

		for (int i = 1; i <= nums.length; i++) {
			if (nums[i - 1] == val) {

				for (int j = nums.length - 1; j >= i; j--) {
					if (nums[j] != val) {
						nums[i - 1] = nums[j];
						nums[j] = val; 
						result++;
						break;
					}
				}

			} else {
				result++;
			}
		}

		return result;
    }
}