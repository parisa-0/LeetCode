class Solution {
    public boolean halvesAreAlike(String s) {
        int indexOfHalf = s.length()/2;

        int countOfVowelsFirstHalf = 0;
        int countOfVowelsSecondHalf = 0;

        for(int i = 0; i < s.length(); i++) {
            if(i < indexOfHalf && (s.charAt(i) == 'a' || s.charAt(i) == 'e' 
            || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
            || s.charAt(i) == 'A' || s.charAt(i) == 'E' 
            || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')) {
                countOfVowelsFirstHalf++;
            }
            else  if(i >= indexOfHalf && (s.charAt(i) == 'a' || s.charAt(i) == 'e' 
            || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
            || s.charAt(i) == 'A' || s.charAt(i) == 'E' 
            || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')) {
                countOfVowelsSecondHalf++;
            }
        }
        return countOfVowelsFirstHalf == countOfVowelsSecondHalf;
    }
}
