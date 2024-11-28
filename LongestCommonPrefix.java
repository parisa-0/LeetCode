class Solution {
    public String longestCommonPrefix(String[] strs) {
         var minLength = strs[0].length();
        var test = new StringBuilder();

        for (String str : strs) {
            if(str.isEmpty()) {
                System.out.println(" ");
            }
            if (str.length() <= minLength) {
                minLength = str.length();
                test = new StringBuilder(str);
            }
        }

        for (String str : strs) {
            if(test.isEmpty()) {
                System.out.println(" ");
            }
            var index = 0;
            for(int i = 0; i < test.length(); i++) {
                if(str.charAt(i) != test.charAt(i)) {
                    index = i;
                    test.delete(i, test.length());
                    break;
                }
            }
        }
        return test.toString();
    }
}
