class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
		if (arr == null || n < 3) return false;

		int topValue = 0;
		int topPosition = 0;
		for (int i = 0; i < n; i++) {
			if (topValue < arr[i]) {
				topValue = arr[i];
				topPosition = i;
			}
		}
		if (topValue == 0 || topPosition == 0 || topPosition == n - 1) return false;

		for (int i = 0; i < topPosition; i++) {
			if (arr[i] >= arr[i + 1]) return false;
		}

		for (int i = topPosition; i < n - 1; i++) {
			if (arr[i] <= arr[i + 1]) return false;
		}

		return true;
    }
}