class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0;

        for(int i = 0; i < sentences.length; i++) {
            String[] splitWords = sentences[i].split(" ");
            if(max < splitWords.length) {
                max = splitWords.length;
            }
        }
        return max;  
    }
}
