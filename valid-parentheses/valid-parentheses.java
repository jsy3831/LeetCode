class Solution {
    public boolean isValid(String s) {
        int len = s.length();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty())
					return false;
				else if (c == ')' && stack.pop() != '(')
					return false;
				else if (c == '}' && stack.pop() != '{')
					return false;
				else if (c == ']' && stack.pop() != '[')
					return false;
			}
		}

		return stack.isEmpty();
    }
}