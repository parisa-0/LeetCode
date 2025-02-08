class Solution {
    public int compress(char[] chars) {
        int writeIndex = 0; 
        int readIndex = 0;  

        while (readIndex < chars.length) {
            char currentChar = chars[readIndex];
            int count = 0;

            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                readIndex++;
                count++;
            }

            chars[writeIndex++] = currentChar;

            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[writeIndex++] = c;
                }
            }
        }

        return writeIndex;
        

        /*
        int currentCount = 0;
        char currentChar = chars[0];
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if(c == currentChar) {
                currentCount++;
            }
            else {
                sb.append(currentChar);
                if(currentCount != 1) {
                    sb.append(currentCount);
                }
                currentCount = 1;
                currentChar = c;
            }
        }

        sb.append(currentChar);
        if(currentCount != 1) {
            sb.append(currentCount);
        }

        for (int i = 0; i < chars.length; i++) {
                if(i < sb.length()) {
                    chars[i] = sb.charAt(i);  
                }  
                else {
                    chars[i] = '\0';
                }           
             }
            return sb.length();  
            */
    }
}
