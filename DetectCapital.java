class Solution {
    public boolean detectCapitalUse(String word) {

        if(word.toUpperCase().equals(word) || word.toLowerCase().equals(word)) {
            return true;
        }

        if(Character.isUpperCase(word.charAt(0))
        && word.substring(1).toLowerCase().equals(word.substring(1))) {
            return true;
        }

        return false;

        /*
      boolean allUpperCase = word.chars().allMatch(Character::isUpperCase);
      boolean allLowerCase = word.chars().allMatch(Character::isLowerCase);
      boolean firstLetterUpperCase = word.chars().findFirst().stream().allMatch(Character::isUpperCase);
      boolean restOfCharacterAreLowerCase = word.chars().skip(1).allMatch(Character::isLowerCase);

   return allUpperCase || allLowerCase || (firstLetterUpperCase && restOfCharacterAreLowerCase); 
   */
           
    }
}
