class Solution {
    public String removeStars(String s) {
 StringBuilder c = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                c.deleteCharAt(c.length() - 1);
            } else {
                c.append(s.charAt(i));
            }
        }
        return c.toString();
        /*
        Stack<Character> myStack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '*') {
                myStack.push(s.charAt(i));
            }
            else if(s.charAt(i) == '*') {
                myStack.pop();
            }
        }

        String result = "";
       for (char val: myStack)
		{
            result += val;
		}

        return result;
        */
    }
}
