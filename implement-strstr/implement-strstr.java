class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
		int needleLen = needle.length();

		if (needleLen == 0)
			return 0;
		if (haystackLen < needleLen)
			return -1;
		if (haystackLen == needleLen)
			return haystack.equals(needle) ? 0 : -1;

		for (int i = 0; i < haystackLen; i++) {
			if (i + needleLen > haystackLen)
				break;
            
			for (int j = 0; j < needleLen; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j))
					break;
				if (j == needleLen - 1)
					return i;
			}
		}

		return -1;
    }
}