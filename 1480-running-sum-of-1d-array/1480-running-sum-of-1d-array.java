class Solution {

    int sum = 0;

    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

		for (int i=0; i< nums.length; i++) {
			runningSum[i] = sum(nums[i]);
		}

		// System.out.println(Arrays.toString(runningSum));
		return runningSum;
    }

    public int sum(int num) {
		sum += num;
		return sum;
	}
}