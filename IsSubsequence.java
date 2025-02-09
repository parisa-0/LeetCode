class Solution {
    public boolean isSubsequence(String s, String t) {

        char[] sCharArray = s.toCharArray();
        for (char c : sCharArray) {
            int index = t.indexOf(c);
            if(index != -1) {
                t = t.substring(index+1);
            }
            else {
                return false;
            }
        }
    return true;

        /*
      int sPointer = 0;
      int tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
           if (s.charAt(sPointer) == t.charAt(tPointer)) {
               sPointer++;
           }
        tPointer++;
       }
       return sPointer >= s.length();
       */
    }
}
