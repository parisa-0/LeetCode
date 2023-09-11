class Solution {
    public boolean isPalindrome(String s) {

       s = s.toLowerCase();

       var stringBuilder = new StringBuilder();

       for (char c : s.toCharArray()) {
           if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
             stringBuilder.append(c);
           }
        }

        s = stringBuilder.toString();

       for(int i = 0; i < s.length()/2; i++) {
         if (s.charAt(i) != s.charAt((s.length() - 1) - i)) {
             return false;
         }
       }
      return true;
    }
}
