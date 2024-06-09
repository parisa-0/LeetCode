class Solution {
    public String reversePrefix(String word, char ch) {
       int theIndex = word.indexOf(ch);
       String theWord = word.substring(0, theIndex + 1);
        var theWordToReverse = new StringBuilder(theWord);
        theWordToReverse.reverse();

        return theWordToReverse + word.substring(theIndex+1, word.length());
    }
}
