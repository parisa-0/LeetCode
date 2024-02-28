class Solution {
    public int maxVowels(String s, int k) {
        int countOfVowels = 0;
        int maximumNumberOfVowels = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++) {
               
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
            || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                countOfVowels++;
            }
        }

            maximumNumberOfVowels = countOfVowels;
        
        for(int j = k; j < s.length(); j++) {

            if(s.charAt(j - k) == 'a' || s.charAt(j - k) == 'e' || s.charAt(j - k) == 'i'
            || s.charAt(j - k) == 'o' || s.charAt(j - k) == 'u') {
                countOfVowels--;
            }
            if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i'
            || s.charAt(j) == 'o' || s.charAt(j) == 'u') {
                countOfVowels++;
            }
            maximumNumberOfVowels = Math.max(maximumNumberOfVowels, countOfVowels);
        }
           
        return maximumNumberOfVowels;
    }
}
