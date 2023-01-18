class Solution {
    public int findNumbers(int[] nums) {
        int evenNumberOfDigits = 0;

		for (int num : nums) {
			String digits = String.valueOf(num);

			if (digits.length() % 2 == 0) {
				evenNumberOfDigits++;
			}
		}
		return evenNumberOfDigits;
    }
}