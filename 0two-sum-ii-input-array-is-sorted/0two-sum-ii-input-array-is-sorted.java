class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

		while (numbers[l] + numbers[r] != target) {
			if (numbers[l] + numbers[r] < target)
				l++;
			else
				r--;
			/* Smaller sums would come from the left half of the array
			Larger sums would come from the right half of the array */
		}

		return new int[] {l + 1, r + 1};
    }
}