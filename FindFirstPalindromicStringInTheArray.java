import java.util.*;
class Solution {
    public String firstPalindrome(String[] words) {

        for(String word : words) {
            StringBuilder sb = new StringBuilder(word);
            if(word.equals(sb.reverse().toString())) {
                return word;
            }
        }

        return "";

        /*
        List<String> myList = new ArrayList<>();
         Arrays.stream(words).forEach((word) -> {
            StringBuilder sb = new StringBuilder(word);
            if(word.equals(sb.reverse().toString())) {
                myList.add(word);
            }
        });
    return (myList.isEmpty() ? "" : myList.get(0));
    */
    }
}
