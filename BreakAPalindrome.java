class Solution {
    public String breakPalindrome(String palindrome) {

        if (palindrome.length() == 1) {
            return "";
        }

        boolean onlyA = false;
        StringBuilder palindromeSB = new StringBuilder(palindrome);

        for(int i = 0; i < palindromeSB.length()/2; i++) {
            if(palindromeSB.charAt(i) != 'a') {
                palindromeSB.setCharAt(i, 'a');
                onlyA = false;
                break;
            }
            else {
                onlyA = true;
            }
        }

        if(onlyA) {
            palindromeSB.setCharAt(palindromeSB.length() - 1, 'b');
        }

       return palindromeSB.toString();
    }
}
