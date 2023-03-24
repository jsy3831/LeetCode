class Solution {
    public void reverseString(char[] s) {
		recursiveArray(s.length - 1, s);
	}

	void recursiveArray(int index, char[] s) {
		if (index < s.length / 2)
			return;

		char temp = s[index];
		s[index] = s[s.length - index - 1];
		s[s.length - index - 1] = temp;

		recursiveArray(index - 1, s);
	}
}