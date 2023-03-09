class Solution {
    private int getNext(int n) {
		int totalSum = 0;

		while (n > 0) {
			int d = n % 10;
			n = n / 10;
			totalSum += d * d;
		} // "picking digits off one-by-one" is a useful technique

		return totalSum;
	}
    
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

		while (n != 1 && !seen.contains(n)) {
			seen.add(n);
			n = getNext(n);
		}

		return n == 1;
    }
}