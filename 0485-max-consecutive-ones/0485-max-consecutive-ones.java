class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
		int consecutive = 0;

		for (int num : nums) {
			if (num == 1) {
				count++;
			} else {
				if (count > consecutive) {
					consecutive = count;
				}
				count = 0;
			}
		}

		if (count > consecutive) {
			consecutive = count;
		}

		return consecutive;
    }
}