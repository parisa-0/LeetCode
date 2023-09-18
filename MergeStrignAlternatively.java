class Solution {
    public String mergeAlternately(String word1, String word2) {
         String longestString = " ";
        String shortestString = " ";

        if(word1.length() >= word2.length()) {
            longestString = word1;
            shortestString = word2;
        }
        else {
            longestString = word2;
            shortestString = word1;
        }


        String mergedString = "";
        String remainder = longestString.substring(shortestString.length(),shortestString.length() + (longestString.length() - shortestString.length()));

        for (int i = 0; i < shortestString.length(); i++) {
                mergedString = mergedString + word1.charAt(i) + word2.charAt(i);
        }
        return mergedString + remainder;
}
}
