class Solution {
            
    //two pointer problem

    public boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' 
        || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U');
    }

    public String reverseVowels(String s) {

    char[] inputStringArray = s.toCharArray();
    int start = 0;
    int end = s.length()-1;
    
    while(start < end) {
        if(!isVowel(inputStringArray[start])) {
            start++;
        }
        else if(!isVowel(inputStringArray[end])) {
            end--;
        }
        else if(start < end) {
            char vowelCharacter = inputStringArray[start];
            inputStringArray[start++] = inputStringArray[end];
            inputStringArray[end--] = vowelCharacter;
        }
    }
         return new String(inputStringArray);   
    }
}
