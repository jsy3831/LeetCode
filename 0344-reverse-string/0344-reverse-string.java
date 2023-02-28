class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length <= 1)
			return;

		int i = 0;
		int j = s.length - 1;
		while (i < j) {
			char dump = s[i];
			s[i] = s[j];
			s[j] = dump;

			i++;
			j--;
		}
    }
}