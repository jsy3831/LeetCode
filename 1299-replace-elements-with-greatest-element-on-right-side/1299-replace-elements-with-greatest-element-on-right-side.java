class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
		if (arr == null || n == 0) return null;

        for (int i = 0; i < n-1; i++) {
			int max = 0;
			for (int j = n-1; j > i; j--) {
				if (max < arr[j]) {
					max = arr[j];
				}
			}
			arr[i] = max;
		}

		arr[n-1] = -1;
		
		return arr;
    }
}